package main.ilyazamkovoy.security;

import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.entity.StaffEntity;
import main.ilyazamkovoy.repositories.AdminRepository;
import main.ilyazamkovoy.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class AuthProviderImpl implements AuthenticationProvider {

    @Qualifier("userRepository")
    @Autowired
    UserRepository userRepository;

    @Qualifier("staffRepository")
    @Autowired
    StaffRepository staffRepository;


    @Qualifier("adminRepository")
    @Autowired
    AdminRepository adminRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();

        UserEntity user = userRepository.findOneByEmail(email);
        StaffEntity staff = staffRepository.findOneByLogin(email);
        AdminEntity admin = adminRepository.findOneByLogin(email);

        if (user == null && staff == null && admin == null) {
            throw new UsernameNotFoundException("user not found");
        }

        String password = authentication.getCredentials().toString();
        SimpleGrantedAuthority grantedAuthority = null;

        if (user != null) {
            if (user.getPassw() != null && !password.equals(user.getPassw())) {
                throw new BadCredentialsException("invalid user password");
            } else {
                grantedAuthority = new SimpleGrantedAuthority(user.getRole().toString());
            }
        }

        if (staff != null) {
            if (staff.getPassw() != null && !password.equals(staff.getPassw())) {
                throw new BadCredentialsException("invalid staff password");
            } else {
                grantedAuthority = new SimpleGrantedAuthority(staff.getRole().toString());
            }
        }

        if (admin != null) {
            if (admin.getPassw() != null && !password.equals(admin.getPassw())) {
                throw new BadCredentialsException("invalid admin password");
            } else {
                grantedAuthority = new SimpleGrantedAuthority(admin.getRole().toString());
            }
        }


        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(grantedAuthority);
        if(user!=null) {
            return new UsernamePasswordAuthenticationToken(user, null, authorities);
        }else if(staff!=null){
            return new UsernamePasswordAuthenticationToken(staff, null, authorities);
        } else{
            return new UsernamePasswordAuthenticationToken(admin, null, authorities);
        }

    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}

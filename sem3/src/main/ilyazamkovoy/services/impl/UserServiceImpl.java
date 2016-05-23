package main.ilyazamkovoy.services.impl;

import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.form.UserForm;
import main.ilyazamkovoy.repositories.UserRepository;
import main.ilyazamkovoy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zamkovoyilya on 03/05/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Qualifier("userRepository")
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public void saveNewUser(UserForm userForm) {
        UserEntity userEntity = new UserEntity();
        userRepository.save(userEntity);
    }

    @Override
    public UserEntity getUserByEmail(String email) {

        return userRepository.findOneByEmail(email);

    }

    @Override
    @Transactional
    public void updateFlightIdentity(String identity, String email) {
        UserEntity userEntity = userRepository.findOneByEmail(email);

        userEntity.setFlightIdentity(identity);
    }


}

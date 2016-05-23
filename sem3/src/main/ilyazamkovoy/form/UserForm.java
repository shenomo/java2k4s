package main.ilyazamkovoy.form;


import main.ilyazamkovoy.entity.UserEntity;
import org.hibernate.validator.constraints.NotEmpty;
import main.ilyazamkovoy.entity.enums.Role;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

/**
 * Created by zamkovoyilya on 03/05/16.
 */
public class UserForm {

    @NotEmpty
    @Size(max = 30, message = "Максимальная длина 30 символов")
    private String firstName;

    @NotEmpty
    @Size(max = 30, message = "Максимальная длина 30 символов")
    private String lastName;

    @NotEmpty
    @Size(max = 30, message = "Максимальная длина 30 символов")
    private String email;

    @NotEmpty
    @Size(max = 30, message = "Максимальная длина 30 символов")
    private String passw;

    @Enumerated(EnumType.STRING)
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public UserEntity transformToEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(email);
        userEntity.setFirstName(firstName);
        userEntity.setLastName(lastName);
        userEntity.setPassw(passw);
        userEntity.setRole(Role.ROLE_CLIENT);
        return userEntity;
    }

}

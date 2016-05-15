package main.ilyazamkovoy.services;

import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.form.UserForm;

/**
 * Created by zamkovoyilya on 03/05/16.
 */
public interface UserService {

    void saveNewUser(UserForm userForm);

    UserEntity getUserByEmail(String email);

    void updateFlightIdentity(String identity, String email);


}

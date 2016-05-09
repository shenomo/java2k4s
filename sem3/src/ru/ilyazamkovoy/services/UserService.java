package ru.ilyazamkovoy.services;

import ru.ilyazamkovoy.entity.UserEntity;
import ru.ilyazamkovoy.form.UserForm;

/**
 * Created by zamkovoyilya on 03/05/16.
 */
public interface UserService {

    void saveNewUser(UserForm userForm);

    UserEntity getUserByMail(String email);




}

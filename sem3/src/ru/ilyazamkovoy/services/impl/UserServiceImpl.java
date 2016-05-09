package ru.ilyazamkovoy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ilyazamkovoy.entity.UserEntity;
import ru.ilyazamkovoy.form.UserForm;
import ru.ilyazamkovoy.repositories.UserRepository;
import ru.ilyazamkovoy.services.UserService;

/**
 * Created by zamkovoyilya on 03/05/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public void saveNewUser(UserForm userForm) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userForm.getEmail());
        userEntity.setFirstName(userForm.getFirstName());
        userEntity.setLastName(userForm.getLastName());
        userEntity.setEmail(userForm.getEmail());
        userEntity.setPassw(userForm.getPassw());

        // TODO добавить оставшиеся поля


        userRepository.saveAndFlush(userEntity);
    }

    @Override
    public UserEntity getUserByMail(String email) {

        return userRepository.findOneByEmail(email);

    }


}

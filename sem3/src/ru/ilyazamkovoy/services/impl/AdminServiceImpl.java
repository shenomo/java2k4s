package ru.ilyazamkovoy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ilyazamkovoy.entity.AdminEntity;
import ru.ilyazamkovoy.form.AdminForm;
import ru.ilyazamkovoy.repositories.AdminRepository;
import ru.ilyazamkovoy.services.AdminService;

/**
 * Created by zamkovoyilya on 09/05/16.
 */

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRepository adminRepository;


    @Override
    public void saveNewAdmin(AdminForm adminForm) {
        AdminEntity adminEntity = new AdminEntity();



        adminEntity.setEmail(adminForm.getEmail());

        adminRepository.saveAndFlush(adminEntity);

    }
}

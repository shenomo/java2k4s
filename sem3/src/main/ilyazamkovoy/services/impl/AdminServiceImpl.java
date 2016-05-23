package main.ilyazamkovoy.services.impl;

import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.form.AdminForm;
import main.ilyazamkovoy.repositories.AdminRepository;
import main.ilyazamkovoy.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by zamkovoyilya on 09/05/16.
 */

@Service
public class AdminServiceImpl implements AdminService{

    @Qualifier("adminRepository")
    @Autowired
    AdminRepository adminRepository;

    @Override
    public void saveNewAdmin(AdminForm adminForm) {
        adminRepository.save(adminForm.transformToEntity());
    }

    @Override
    public AdminEntity getAdminByLogin(String login) {
        return adminRepository.findOneByLogin(login);
    }
}

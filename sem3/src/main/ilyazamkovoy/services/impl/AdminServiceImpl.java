package main.ilyazamkovoy.services.impl;

import main.ilyazamkovoy.entity.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.form.AdminForm;
import main.ilyazamkovoy.repositories.AdminRepository;
import main.ilyazamkovoy.services.AdminService;

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
        AdminEntity adminEntity = new AdminEntity();

        adminEntity.setLogin(adminForm.getLogin());
        adminEntity.setPassw(adminForm.getPassword());
        adminEntity.setRole(Role.ROLE_ADMIN);

        adminRepository.save(adminEntity);

    }

    @Override
    public AdminEntity getAdminByLogin(String login) {

        AdminEntity adminEntity = adminRepository.findOneByLogin(login);

        return adminEntity;
    }
}

package main.ilyazamkovoy.services;

import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.form.AdminForm;

/**
 * Created by zamkovoyilya on 09/05/16.
 */


public interface AdminService {

    void saveNewAdmin(AdminForm adminForm);

    AdminEntity getAdminByLogin(String login);

}

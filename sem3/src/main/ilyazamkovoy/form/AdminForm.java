package main.ilyazamkovoy.form;

import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.entity.enums.Role;

/**
 * Created by zamkovoyilya on 09/05/16.
 */

public class AdminForm {

    private Long id;
    private String login;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public AdminEntity transformToEntity() {
        AdminEntity adminEntity = new AdminEntity();
        adminEntity.setLogin(login);
        adminEntity.setPassw(password);
        adminEntity.setRole(Role.ROLE_ADMIN);
        return adminEntity;
    }
}

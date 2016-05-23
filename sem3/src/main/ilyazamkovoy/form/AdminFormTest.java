package main.ilyazamkovoy.form;

import junit.framework.Assert;
import main.ilyazamkovoy.entity.AdminEntity;
import main.ilyazamkovoy.entity.enums.Role;
import org.junit.Test;

/**
 * Created by zamkovoyilya on 23/05/16.
 */

public class AdminFormTest {

    @Test
    public void testTransformToEntity() throws Exception {
        AdminForm adminForm = new AdminForm();
        adminForm.setLogin("login");
        adminForm.setPassword("password");
        AdminEntity adminEntity = adminForm.transformToEntity();
        Assert.assertEquals(adminEntity.getLogin(), adminForm.getLogin());
        Assert.assertEquals(adminEntity.getPassw(), adminForm.getPassword());
        Assert.assertEquals(adminEntity.getRole(), Role.ROLE_ADMIN);
    }
}
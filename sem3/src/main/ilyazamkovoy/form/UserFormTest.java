package main.ilyazamkovoy.form;

import junit.framework.Assert;
import main.ilyazamkovoy.entity.UserEntity;
import main.ilyazamkovoy.entity.enums.Role;
import org.junit.Test;

/**
 * Created by zamkovoyilya on 23/05/16.
 */
public class UserFormTest {

    @Test
    public void testTransformToEntity() throws Exception {
        UserForm userForm = new UserForm();
        userForm.setFirstName("firstName");
        userForm.setLastName("lastName");
        userForm.setPassw("password");
        userForm.setRole(Role.ROLE_CLIENT);
        UserEntity userEntity = userForm.transformToEntity();
        Assert.assertEquals(userForm.getFirstName(), userEntity.getFirstName());
        Assert.assertEquals(userForm.getLastName(), userEntity.getLastName());
        Assert.assertEquals(userForm.getPassw(), userEntity.getPassw());
        Assert.assertEquals(userForm.getEmail(), userEntity.getEmail());
        Assert.assertEquals(userForm.getRole(), Role.ROLE_CLIENT);
    }
}
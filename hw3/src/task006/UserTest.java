package task006;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class UserTest {

    User user = new User();

    @Test
    public void testGetId() throws Exception {
        assertEquals(10, user.getId());
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("super user name", user.getName());
    }

    @Test
    public void testGetAge() throws Exception {
        assertEquals(20, user.getAge());
    }

    @Test
    public void testGetCountry() throws Exception {
        assertEquals("super user country", user.getCountry());
    }
}
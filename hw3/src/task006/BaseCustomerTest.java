package task006;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class BaseCustomerTest {

    @Test
    public void testGetHappiness() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {
        BaseCustomer da = new BaseCustomer() {
            @Override
            public void increaseHappiness() {

            }

            @Override
            public void decreaseHappiness() {

            }
        };

        assertEquals("i am super customer", da.getName());
    }

    @Test
    public void testGetProjectables() throws Exception {

    }
}
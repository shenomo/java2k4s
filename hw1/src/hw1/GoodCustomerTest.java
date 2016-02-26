package hw1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zamkovoyilya on 24/02/16.
 */
public class GoodCustomerTest {

    GoodCustomer customer = new GoodCustomer();

    @Test
    public void testIncreaseHappiness() throws Exception {
        int happiness = customer.getHappiness();
        customer.increaseHappiness();
        assertEquals(happiness + 1, customer.getHappiness());
    }

    @Test
    public void testDecreaseHappiness() throws Exception {
        int happiness = customer.getHappiness();
        customer.decreaseHappiness();
        assertEquals(happiness - 1, customer.getHappiness());
    }
}
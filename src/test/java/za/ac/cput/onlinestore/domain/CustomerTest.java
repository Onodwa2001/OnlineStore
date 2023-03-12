package za.ac.cput.onlinestore.domain;

import org.junit.Test;
import za.ac.cput.onlinestore.domain.Customer;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

class CustomerTest {
    @Test
    public void objectEquality(){
        Customer customer = new Customer("K09752", "Karabo", "Magagula", "magagula@gmail.com");
        assertNotNull(customer);
    }

    @Test
    public void objectIdentity(){
        Customer customer = new Customer("09752", "Karabo", "Magagula", "magagula@gmail.com");
        assertSame(customer, customer);
    }

    @Test
    public void failingTest(){
        Customer customer = new Customer("09752", "Karabo", "Magagula", "magagula@gmail.com");
        System.out.println(customer.toString());
        assertNotNull(customer);
    }




}


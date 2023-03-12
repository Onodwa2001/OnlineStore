/*OrderTest.java
 * Author: Byron Young 218155077
 * Description - Testing class used to test Order class
 * 12/03/2023
 * */
package za.ac.cput.onlinestore.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testObjectEquality() {
        Order order1 = new Order(1, "Byron");
        Order order2 = new Order(1, "Byron");
        assertEquals(order1, order2);
    }

    @Test
    void testObjectIdentity() {
        Order order1 = new Order(1, "Byron");
        Order order2 = order1;
        assertSame(order1, order2);
    }

    @Test
    void testFailingTest() {
        Order order1 = new Order(1, "Byron");
        Order order2 = new Order(2, "Onodwa");
        assertEquals(order1, order2);
    }

    @Test
    public void testTimeout(){

    }
    @Disabled
    @Test
    void testDisabledTest() {
        Order order1 = new Order(1, "Byron");
        Order order2 = new Order(1, "Byron");
        assertEquals(order1, order2);
    }

}
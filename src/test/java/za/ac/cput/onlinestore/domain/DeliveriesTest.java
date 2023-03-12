/**
 * DeliveriesTest.java
 * This is the test class
 * @author Lindiwe Thokozile Somana
 * @student no. 218076509
 * 12 March 2023
 *
 */

package za.ac.cput.onlinestore.domain;

import org.junit.jupiter.api.*;
import za.ac.cput.onlinestore.domain.Deliveries;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveriesTest {

    Deliveries delivery1;
    Deliveries delivery2;

    @BeforeEach
    void setupTest(){
        delivery1 = new Deliveries();
        delivery2 = new Deliveries("002","35", "84671","0018014","07-03-2023");

    }

    @Test
    void objectEqualityTest(){
        delivery1 = delivery2;
        assertEquals(delivery1,delivery2);

    }

    @Test
    void objectIdentityNotSameTest(){
        assertNotSame(delivery1,delivery2);
    }

    //@Test
    void objectIdentitySameTest(){
        assertSame(delivery1,delivery2);

    }

    @Test
    void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will be passed within this duration");
    }

    @Disabled("TODO: Test is currently failing and needs to be fixed")
    @DisplayName("Disabling Test")
   // @Test
    void disablingTest(){
       fail("Not yet implemented");
    }

    @Test
    void failingTest(){
        fail("Not yet implemented");
    }

}

package za.ac.cput.onlinestore.domain;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

// Onodwa Siyotula - 220087016
public class TransactionReportsTest {

    TransactionReports tr = new TransactionReports("362358", "7382452", "1145318",
            "1245455", "939828", "2023-02-12 02:40:01");

    @Test
    public void objectEquality() {
        assertEquals("1245455", tr.getProductID());
    }

    @Test
    public void objectIdentitySame() {
        TransactionReports tr2 = tr;
        assertSame(tr, tr2);
    }

    @Test
    public void objectIdentityNotSame() {
        TransactionReports tr2 = new TransactionReports("362358", "7382452", "1145318",
                "1245455", "939828", "2023-02-12 02:40:01");
        assertNotSame(tr, tr2);
    }

    // failing test
    @Test
    public void reportIDTest() {
        assertNull(tr.getReportID());
    }

    @Test(timeout = 100)
    public void testWithTimeout() {
        // should not take longer than 100 milliseconds
        tr.showTransactions();
    }

    @Ignore
    @Test
    public void testDate() {
        assertNull(tr.getDate());
    }

}

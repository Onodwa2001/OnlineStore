package za.ac.cput.onlinestore;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ProductTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProductTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ProductTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testProduct()
    {
        assertTrue( true );
    }
}
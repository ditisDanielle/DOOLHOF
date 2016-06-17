package doolhofspel;

import java.awt.Image;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class HelperTest {
    
    public HelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHelper method, of class Helper.
     */
    @Test
    public void testGetHelper() {
        System.out.println("getHelper");
        Image afbeelding = null;
        Helper instance = new Helper();
        Image expResult = null;
        Image result = instance.getHelper(afbeelding);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldX method, of class Helper.
     */
    @Test
    public void testGetVeldX() {
        System.out.println("getVeldX");
        Helper instance = new Helper();
        int expResult = 0;
        int result = instance.getVeldX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldY method, of class Helper.
     */
    @Test
    public void testGetVeldY() {
        System.out.println("getVeldY");
        Helper instance = new Helper();
        int expResult = 0;
        int result = instance.getVeldY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of routeTonen method, of class Helper.
     */
    @Test
    public void testRouteTonen() {
        System.out.println("routeTonen");
        Helper instance = new Helper();
        instance.routeTonen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

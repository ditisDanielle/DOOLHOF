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

public class ValsspelerTest {
    
    public ValsspelerTest() {
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
     * Test of getVeldX method, of class Valsspeler.
     */
    @Test
    public void testGetVeldX() {
        System.out.println("getVeldX");
        Valsspeler instance = new Valsspeler();
        int expResult = 0;
        int result = instance.getVeldX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldY method, of class Valsspeler.
     */
    @Test
    public void testGetVeldY() {
        System.out.println("getVeldY");
        Valsspeler instance = new Valsspeler();
        int expResult = 0;
        int result = instance.getVeldY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of waardeResetten method, of class Valsspeler.
     */
    @Test
    public void testWaardeResetten() {
        System.out.println("waardeResetten");
        Valsspeler instance = new Valsspeler();
        instance.waardeResetten();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

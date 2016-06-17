package doolhofspel;

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

public class HeldTest {
    
    public HeldTest() {
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
     * Test of resetHeld method, of class Held.
     */
    @Test
    public void testResetHeld() {
        System.out.println("resetHeld");
        Held instance = new Held();
        instance.resetHeld();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldX method, of class Held.
     */
    @Test
    public void testGetVeldX() {
        System.out.println("getVeldX");
        Held instance = new Held();
        int expResult = 0;
        int result = instance.getVeldX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldY method, of class Held.
     */
    @Test
    public void testGetVeldY() {
        System.out.println("getVeldY");
        Held instance = new Held();
        int expResult = 0;
        int result = instance.getVeldY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lopen method, of class Held.
     */
    @Test
    public void testLopen() {
        System.out.println("lopen");
        int vx = 0;
        int vy = 0;
        Held instance = new Held();
        instance.lopen(vx, vy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of schieten method, of class Held.
     */
    @Test
    public void testSchieten() {
        System.out.println("schieten");
        Held instance = new Held();
        instance.schieten();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bazookaPakken method, of class Held.
     */
    @Test
    public void testBazookaPakken() {
        System.out.println("bazookaPakken");
        Held instance = new Held();
        instance.bazookaPakken();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

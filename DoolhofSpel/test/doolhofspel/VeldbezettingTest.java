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

public class VeldbezettingTest {
    
    public VeldbezettingTest() {
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
     * Test of setImage method, of class Veldbezetting.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        Image afbeelding = null;
        Veldbezetting instance = new VeldbezettingImpl();
        instance.setImage(afbeelding);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Veldbezetting.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Veldbezetting instance = new VeldbezettingImpl();
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPositie method, of class Veldbezetting.
     */
    @Test
    public void testSetPositie() {
        System.out.println("setPositie");
        int x = 0;
        int y = 0;
        Veldbezetting instance = new VeldbezettingImpl();
        instance.setPositie(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Veldbezetting.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        int x = 0;
        Veldbezetting instance = new VeldbezettingImpl();
        int expResult = 0;
        int result = instance.getX(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Veldbezetting.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        int y = 0;
        Veldbezetting instance = new VeldbezettingImpl();
        int expResult = 0;
        int result = instance.getY(y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VeldbezettingImpl extends Veldbezetting {
    }
    
}

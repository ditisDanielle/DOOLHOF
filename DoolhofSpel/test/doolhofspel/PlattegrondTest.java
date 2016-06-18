package doolhofspel;

import java.awt.Image;
import java.util.ArrayList;
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

public class PlattegrondTest {
    
    public PlattegrondTest() {
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
     * Test of getMapgrootte method, of class Plattegrond.
     */
    @Test
    public void testGetMapgrootte() {
        System.out.println("getMapgrootte");
        Plattegrond instance = new Plattegrond();
        int expResult = 0;
        int result = instance.getMapgrootte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeGras method, of class Plattegrond.
     */
    @Test
    public void testGetGras() {
        System.out.println("getGras");
        Plattegrond instance = new Plattegrond();
        Image expResult = null;
        Image result = instance.makeGras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeMuur method, of class Plattegrond.
     */
    @Test
    public void testGetMuur() {
        System.out.println("getMuur");
        Plattegrond instance = new Plattegrond();
        Image expResult = null;
        Image result = instance.makeMuur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeBazooka method, of class Plattegrond.
     */
    @Test
    public void testGetBazooka() {
        System.out.println("getBazooka");
        Plattegrond instance = new Plattegrond();
        Image expResult = null;
        Image result = instance.makeBazooka();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeVriend method, of class Plattegrond.
     */
    @Test
    public void testGetVriend() {
        System.out.println("getVriend");
        Plattegrond instance = new Plattegrond();
        Image expResult = null;
        Image result = instance.makeVriend();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeStart method, of class Plattegrond.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Plattegrond instance = new Plattegrond();
        Image expResult = null;
        Image result = instance.makeStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMap method, of class Plattegrond.
     */
    @Test
    public void testGetMap() {
        System.out.println("getMap");
        int x = 0;
        int y = 0;
        Plattegrond instance = new Plattegrond();
        Veldbezetting expResult = null;
        Veldbezetting result = instance.getMap(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openFile method, of class Plattegrond.
     */
    @Test
    public void testOpenFile() {
        System.out.println("openFile");
        Plattegrond instance = new Plattegrond();
        instance.openFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFile method, of class Plattegrond.
     */
    @Test
    public void testReadFile() {
        System.out.println("readFile");
        Plattegrond instance = new Plattegrond();
        instance.readFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMapObjects method, of class Plattegrond.
     */
    @Test
    public void testGetMapObjects() {
        System.out.println("getMapObjects");
        Plattegrond instance = new Plattegrond();
        ArrayList expResult = null;
        ArrayList result = instance.getMapObjects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeFile method, of class Plattegrond.
     */
    @Test
    public void testCloseFile() {
        System.out.println("closeFile");
        Plattegrond instance = new Plattegrond();
        instance.closeFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

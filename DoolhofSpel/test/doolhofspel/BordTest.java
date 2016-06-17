package doolhofspel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
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

public class BordTest {
    
    public BordTest() {
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
     * Test of actionPerformed method, of class Bord.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Bord instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class Bord.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        Bord instance = null;
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

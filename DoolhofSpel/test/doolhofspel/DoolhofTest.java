package doolhofspel;

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

public class DoolhofTest {
    
    public DoolhofTest() {
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
     * Test of setTeller method, of class Doolhof.
     */
    @Test
    public void testSetTeller() {
        System.out.println("setTeller");
        int aantal = 0;
        Doolhof instance = new Doolhof();
        instance.setTeller(aantal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchVisibilitySchietknop method, of class Doolhof.
     */
    @Test
    public void testSwitchVisibilitySchietknop() {
        System.out.println("switchVisibilitySchietknop");
        boolean b = false;
        Doolhof instance = new Doolhof();
        instance.switchVisibilitySchietknop(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Doolhof.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Doolhof instance = new Doolhof();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

package doolhofspel;

import javax.swing.JFrame;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */
class Doolhof {

    public Doolhof() {
    JFrame frame = new JFrame();
        frame.setTitle("Zoek je vriend!");
        frame.add(new Bord());
        frame.setSize(694, 728); // eerste int is breedte, tweede is lengte
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}

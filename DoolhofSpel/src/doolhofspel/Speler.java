package doolhofspel;

import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Speler extends Tempbezetting {
    public Speler() {
        ImageIcon img = new ImageIcon("Pictures//held.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
    }
}

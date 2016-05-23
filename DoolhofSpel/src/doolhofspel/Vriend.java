package doolhofspel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Vriend extends Veldbezetting {
    private int veldX;
    private int veldY;
    private Image vriend;
    
    public Vriend(){
        ImageIcon img = new ImageIcon("Pictures//vriend.png");
        vriend = img.getImage();
        veldX = 1;
        veldY = 1;
    }
    
}

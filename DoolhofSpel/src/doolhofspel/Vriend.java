package doolhofspel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Vriend extends Veldbezetting {
        // waarden 1 nog vervangen door variabelenaam
    
    public Vriend(){
        ImageIcon img = new ImageIcon("Pictures//vriend.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
    }
    
public Image getVriendImage(){
        Image vb = null;
        Image vriend = super.getImage();
        return vriend;
    }

}


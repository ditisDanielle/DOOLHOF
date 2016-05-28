package doolhofspel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Bazooka extends Tempbezetting {
        
    //constructor
     // waarden 1 nog vervangen door variabelenaam
    public Bazooka() {
        ImageIcon img = new ImageIcon("Pictures//bazooka.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
    }
    
    // haal afbeelding op uit Tempbezetting
    public Image getBazooka(Image afbeelding){
        return afbeelding;
    }
    
    
    // waarden 1 nog vervangen door variabelenaam
    public int getVeldX(){
        return super.getX(1);
    }
    public int getVeldY(){
        return super.getY(1);
    }
}

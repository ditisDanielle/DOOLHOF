package doolhofspel;

import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Valsspeler extends Tempbezetting {
     
    public Valsspeler(){
        ImageIcon img = new ImageIcon();
        super.setImage(img.getImage());
        super.setPositie(1,1);
    }

    // waarden 1 nog vervangen door variabelenaam
    public int getVeldX(){
        return super.getX(1);
    }
    
    public int getVeldY(){
        return super.getY(1);
    }
    
    public void waardeResetten(){
        
    }
    
}

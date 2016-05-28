package doolhofspel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Held extends Veldbezetting{
     // waarden 1 nog vervangen door variabelenaam
    public Held(){
      ImageIcon img = new ImageIcon("Pictures//held.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
    }
    
    public Image getHeld(){
        Image held;
        Image vb = null;
        return held = super.getImage(vb);
    }
    
     public int getVeldX(){
        return super.getX(1);
    }
     
    public int getVeldY(){
        return super.getY(1);
    }
    
    public void lopen (int vx, int vy){
        vx += getX(vx);
        vy += getY(vy);
        super.setPositie(vx,vy);
    }
    
    public void schieten(){
        
    }
    
    public void bazookaPakken(){
        
    }
}

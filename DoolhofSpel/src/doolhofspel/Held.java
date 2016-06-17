package doolhofspel;

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
    
    public void resetHeld(){
        super.setPositie(1,1);
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
        // muurwordgras(); methode in bord, maar hoe roep je die aan, held heeft geen weet van bord (geen attribuut)
        // 
    }
    
    public void bazookaPakken(){
        
    }
}

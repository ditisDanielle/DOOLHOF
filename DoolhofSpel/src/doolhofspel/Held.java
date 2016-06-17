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
    
    // deze  methode werkt nog niet
    public void schieten(){
//        ArrayList schiet = kaart.getMapObjects();
//        if (stapX, stapY) instanceof Muur)) {
//            int muurPos = stapX, stapY;
//            schiet.remove(muurPos);
//            Gras gras = new Gras();
//            schiet.add(muurPos, gras);
//        }
    }
    
    public void bazookaPakken(){
        
    }
}

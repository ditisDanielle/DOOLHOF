package doolhofspel;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Held extends Veldbezetting{
    private Plattegrond kaart;
    boolean bazookaJN;
    
    public Held(){
        ImageIcon img = new ImageIcon("Pictures//held.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
        bazookaJN = false;
    }
    
    // deze lijkt overbodig, je kunt toch super.setPositie aanroepen?
//    public void resetHeld(){
//        super.setPositie(1,1);
//    }
        
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
    
    public void schieten(int stapX, int stapY){
       // ook nog inbouwen: situatie met meerdere grasvelden te overbruggen
        kaart = new Plattegrond();
        // de arraylist hieronder (schiet) wordt (nog?) niet gebruikt
        // zoniet, dan kan  de import ook weg
        ArrayList schiet = kaart.getMapObjects();
        if (kaart.getMap(getVeldX() + stapX, getVeldY() + stapY) instanceof Muur){
           System.out.println("SCHIET! MUUR, VERDWIJN!");
           // nu naar changeImage
        }
//        if (stapX, stapY) instanceof Muur)) {
//            int muurPos = stapX, stapY;
//            schiet.remove(muurPos);
//            Gras gras = new Gras();
//            schiet.add(muurPos, gras);
//        }
    }
    
    public void bazookaPakken(){
        bazookaJN = true;
        // zie verder ook methode die onder Bord en daar dus niet hoort, maar die we niet aan de praat krijgen hier
    }
}

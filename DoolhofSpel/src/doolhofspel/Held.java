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
    String looprichting;
    int schietTargetX;
    int schietTargetY;
    
    public Held(){
        ImageIcon img = new ImageIcon("Pictures//held.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
        bazookaJN = false;
    }
    
    public void setRichting(String richting){
        this.looprichting = richting;
    }
    
    public String getRichting(){
        return this.looprichting;
    }
           
    public int getVeldX(){
        return super.getX(1);
    }
     
    public int getVeldY(){
        return super.getY(1);
    }
    
    public int getSchietTargetX(){
        return this.schietTargetX;
    }
    
    public int getSchietTargetY(){
        return this.schietTargetY;
    }
    
    public void lopen (int vx, int vy){
        vx += getX(vx);
        vy += getY(vy);
        super.setPositie(vx,vy);
    }
    
    public void schieten(int X,int Y){

        System.out.println("testschieten vanuit HELD");
        System.out.println(this.looprichting);
        int targetPosX = 0;
        int targetPosY = 0;
            if (this.getRichting().equals("right")){
           
            targetPosX = this.getVeldX() + 1;
            targetPosY = this.getVeldY();
            System.out.println("thisX: "+ this.getVeldX() +"thisY: "+ this.getVeldY());
            System.out.println("targetX: "+ targetPosX +"targetY: "+ targetPosY);
            }
            
            if (this.getRichting().equals("left")){
            targetPosX = this.getVeldX() - 1;
            targetPosY = this.getVeldY();
            System.out.println("thisX: "+ this.getVeldX() +"thisY: "+ this.getVeldY());
            System.out.println("targetX: "+ targetPosX +"targetY: "+ targetPosY);
            }
            
            if (this.getRichting().equals("up")){
           
            targetPosX = this.getVeldX() ;
            targetPosY = this.getVeldY()- 1;
            System.out.println("thisX: "+ this.getVeldX() +"thisY: "+ this.getVeldY());
            System.out.println("targetX: "+ targetPosX +"targetY: "+ targetPosY);
            }
            
            if (this.getRichting().equals("down")){
           
            targetPosX = this.getVeldX() ;
            targetPosY = this.getVeldY()+ 1;
            System.out.println("thisX: "+ this.getVeldX() +"thisY: "+ this.getVeldY());
            System.out.println("targetX: "+ targetPosX +"targetY: "+ targetPosY);
            }
            
            schietTargetX = targetPosX;
            schietTargetY = targetPosY;
            
            
    }
    
    
        

    
    public void bazookaPakken(){
        bazookaJN = true;
        // zie verder ook methode die onder Bord en daar dus niet hoort, maar die we niet aan de praat krijgen hier
    }
}

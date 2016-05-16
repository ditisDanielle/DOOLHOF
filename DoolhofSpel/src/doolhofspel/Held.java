package doolhofspel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Held extends Veldbezetting{
    
    private int veldX;
    private int veldY;
    private Image held;
    
    
    public Held(){
        ImageIcon img = new ImageIcon("Pictures//held.png");
        held = img.getImage();
        veldX = 1;
        veldY = 1;
    }
    public Image getHeld(){
        return held;
    }
    public int getVeldX(){
        return veldX;
    }
    public int getVeldY(){
        return veldY;
    }
    public void lopen (int vx, int vy){
        this.veldX += vx;
        this.veldY += vy;
    }
}

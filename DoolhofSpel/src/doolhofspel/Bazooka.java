package doolhofspel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Bazooka extends Tempbezetting {
    private int veldX, veldY;
    private Image bazooka;
    
    public Bazooka() {
        ImageIcon img = new ImageIcon("Pictures//bazooka.png");
        bazooka = img.getImage();
        veldX = 1;
        veldY = 1;
    }
    public Image getBazooka(){
        return bazooka;
    }
    public int getVeldX(){
        return this.veldX;
    }
    public int getVeldY(){
        return this.veldY;
    }
    public void setVeldX(int x){
        this.veldX = x;
    }
    public void setVeldY(int y) {
        this.veldY = y;
    }
}

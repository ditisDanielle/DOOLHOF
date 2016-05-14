/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhofspel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Danielle
 */
public class Held extends Veldbezetting{
    
    private int richtingX, richtingY, veldX, veldY;
    private Image held;
    
    
    public Held(){
        ImageIcon img = new ImageIcon("Pictures//poppetje.png");
        held = img.getImage();
//        richtingX = 32;
//        richtingY = 32;
        veldX = 1;
        veldY = 1;
    }
    
    public Image getHeld(){
        return held;
    }
    
//    public int getRichtingX(){
//        return richtingX;
//    }
//    
//    public int getRichtingY(){
//        return richtingY;
//    }
    
    public int getVeldX(){
        return veldX;
    }
    
    public int getVeldY(){
        return veldY;
    }
    
    public void lopen (int vx, int vy){//(int rx, int ry, int vx, int vy){
//    this.richtingX += rx;
//    this.richtingY += ry;
    this.veldX += vx;
    this.veldY += vy;
        
    }
    
}

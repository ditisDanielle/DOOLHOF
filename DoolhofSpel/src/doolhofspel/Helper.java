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
public class Helper extends Tempbezetting{
    
    public Helper(){
        // AFBEELDING NOG TOEVOEGEN
    ImageIcon img = new ImageIcon();
        super.setImage(img.getImage());
        super.setPositie(1,1);
    
}

  // haal afbeelding op uit Tempbezetting
    public Image getHelper(Image afbeelding){
        return afbeelding;
    }
    
    
    // waarden 1 nog vervangen door variabelenaam
    public int getVeldX(){
        return super.getX(1);
    }
    public int getVeldY(){
        return super.getY(1);
    }
    
    public void routeTonen(){
        
    }
}

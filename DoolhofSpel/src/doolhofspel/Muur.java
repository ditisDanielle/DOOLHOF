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
 * @author Agnita & Danielle (Groep 7)
 */
public class Muur extends Tempbezetting {
    
        public Muur() {
        ImageIcon img = new ImageIcon("Pictures//brickwall.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
    }
        
        public Image getMuurImage(){
        Image vb = null;
        Image muur = super.getImage(vb);
        return muur;
    }
    
}



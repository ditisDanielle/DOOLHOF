package doolhofspel;

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
        
        
   // deze methode zou changeImage moeten aanroepen op Bord, maar we komen dan met de static en non-static in de knoei.
    // we weten dus dat het anders moet maar hebben geen tijd gehad om dit te fixen.
    @Override
    public void verdwijnen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



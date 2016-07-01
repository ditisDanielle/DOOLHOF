package doolhofspel;

import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Valsspeler extends Tempbezetting {
    
    private final int WAARDEVALSSPELER = 20;
    
    
    
    public Valsspeler(){
        // waarden 1 nog vervangen door variabelenaam
        ImageIcon img = new ImageIcon("Pictures//valsspeler.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
       
    }
          
    public int getVeldX(){
        return super.getX(1);
    }
    
    public int getVeldY(){
        return super.getY(1);
    }

    public void waardeResetten(){
        int stappen = Bord.getStappen()- WAARDEVALSSPELER;
        Bord.setStappenTeller(stappen);
    }
    
    // deze methode zou changeImage moeten aanroepen op Bord, maar we komen dan met de static en non-static in de knoei.
    // we weten dus dat het anders moet maar hebben geen tijd gehad om dit te fixen.
    @Override
    public void verdwijnen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

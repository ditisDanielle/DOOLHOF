package doolhofspel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Bazooka extends Tempbezetting {
    // constructor
    // waarden 1 nog vervangen door variabelenaam
    public Bazooka() {
        ImageIcon img = new ImageIcon("Pictures//bazooka.png");
        super.setImage(img.getImage());
        super.setPositie(1,1);
        
    }
    
    
    
    public void muurVernietigen(){
        // hier de daadwerkelijke code om het muurobject te vervangen door een grasobject
        // daarna knopje (indien gebruikt) op non actief zetten
        // en bazooka verwijderen
        // listener toepassen hier en we moeten dan de "coordinaten" weten
//        if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Muur) {
//            replace held.getVeld.... instanceof Muur by instanceof Gras 
//            geen idee of dat gaat werken, lol
//        }
        // onderstaande regel naar Doolhof verhuisd
//        ActionListener listener = new ClickListener();
    }
    
//    public class ClickListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent event) {
//            System.out.println("I was clicked.");
//        }
//    }
    
}


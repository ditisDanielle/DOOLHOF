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
 * @author Danielle en Agnita (Groep 7)
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
        // pseudo code kortste route berekenen (staat natuurlijk niet op de goede plek, maar for now
        // het is niet van belang om te beginnen met de kortste route, we gaan de route bereken naar de vriend
        // kijk bij elke stap wat er op je pad zit, dus ook of je meerdere wegen kan inslaan
        // bij het kunnen inslaan van meerdere wegen, sla je op waar dat was (kruispunt)
        // kom je bij een doodlopende route, dan terug naar het kruispunt, en de andere route gaan lopen
        // zodra je de vriend gevonden hebt is dat de kortste route, en die sla je op
        // indien mogelijk ga je terug naar het laatste kruispunt, waar je minimaal twee mogelijke routes had
        // repeat, en overschrijf de kortste route telkens als die korter is dan de opgeslagen route
        // geen kruispunten meer, dan heb je de kortste route, die kun je dan "tekenen"
    }
}

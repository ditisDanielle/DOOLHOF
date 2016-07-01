package doolhofspel;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Danielle en Agnita (Groep 7)
 */

public class Helper extends Tempbezetting {
    public static Plattegrond routeKaart;
    Bord bord;
    

    public Helper() {
        ImageIcon img = new ImageIcon("Pictures//helper.png");
        super.setImage(img.getImage());
        super.setPositie(12, 6);
        routeKaart = new Plattegrond("route.txt");
                
    }
    
    public void setBordHelper(Bord bord){
        this.bord = bord;
    }

    // waarden 1 nog vervangen door variabelenaam
    public int getVeldX() {
        return super.getX(1);
    }

    public int getVeldY() {
        return super.getY(1);
    }

    // DEZE METHODE KRIJGEN WE NIET AAN DE PRAAT OMDAT WE CHANGEIMAGE() NIET KUNNEN AANROEPEN
    
//    public void routeTonen() {
//        
//               System.out.println("route tonen");
//        ArrayList routelist = routeKaart.getRouteObjects();
//        int i = 0;
//        while (i < routelist.size()) {
//            Veldbezetting A = routeKaart.routeObjects.get(i);
//            
//            int x = A.getX(i);
//            int y = A.getY(i);
//            Image veld = A.getImage();
//            if (veld.equals("Pictures//route.png")) {
//                RouteVeld routeveld = new RouteVeld();
//                //System.out.println("temp" + temp);
//                bord.changeImage(x,y, routeveld );
//                System.out.println(bord);
//
//                
//            } else {
//                i++;
//            }
//        }
      
//    }
    
    
    
    // deze methode zou changeImage moeten aanroepen op Bord, maar we komen dan met de static en non-static in de knoei.
    // we weten dus dat het anders moet maar hebben geen tijd gehad om dit te fixen.
    @Override
    public void verdwijnen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
       
}

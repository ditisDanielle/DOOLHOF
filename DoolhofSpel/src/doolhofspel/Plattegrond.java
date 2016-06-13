package doolhofspel;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Plattegrond {
    private Scanner file;
    private final int MAPGROOTTE = 21;
    //private String[] map = new String[MAPGROOTTE * MAPGROOTTE]; // velden
    private Image start;
    public ArrayList<Veldbezetting> mapObjects = new ArrayList<>();
    //private Plattegrond kaart;
    
    public Plattegrond() {
        ImageIcon img;
        // KLASSE START maken???? nee toch? hoe dan dit oplossen? 
        // of start gewoon weglaten. start is waar held staat aan begin van het veld
        img = new ImageIcon("Pictures//start.png");
        start = img.getImage();
        //kaart = new Plattegrond();
        openFile();
        readFile();
        closeFile();
    }
    public int getMapgrootte(){
        return this.MAPGROOTTE;
    }
    public Image getGras() {
        Gras gras = new Gras();
        return gras.getImage();
    }
    public Image getMuur() {
        Muur muur = new Muur();
        return muur.getImage();
    }
    public Image getBazooka() {
        Bazooka bazooka = new Bazooka();
        return bazooka.getImage();
    }
    public Image getVriend() {
        Vriend vriend = new Vriend();
        return vriend.getImage();
    }
    public Image getStart() {
        return start;
    }
    
    public Veldbezetting getMap(int x, int y) {
        int index = x * (MAPGROOTTE) + y;
        return mapObjects.get(index);
    }
    public void openFile() {
        try {
            file = new Scanner(new File("kaart.txt"));
        }
        catch(Exception e) {
            System.out.println("Error loading map!");
        }
    }
    public void readFile() {
        int aantal = getMapgrootte();
        for (int z = 0; z < MAPGROOTTE; z++) {
            String line = file.next();
            for (int y = 0; y < MAPGROOTTE; y++) {
                String veld = line.substring(y,y+1);
                    if (veld.equals("g")) {
                        Gras gras = new Gras();
                        mapObjects.add(gras);
                    }
                    if (veld.equals("w")) {
                        Muur muur = new Muur();
                        mapObjects.add(muur);
                    }
                    if (veld.equals("b")) {
                        Bazooka bazooka = new Bazooka();
                        mapObjects.add(bazooka);
                    }
                    if (veld.equals("f")) {
                        Vriend vriend = new Vriend();
                        mapObjects.add(vriend);
                    }        
                     if (veld.equals("s")) {
                        Vriend vriend = new Vriend();
                        mapObjects.add(vriend);
                    }
                }
            //}        
        }
    }        
    public void closeFile() {
        file.close();
    }
}

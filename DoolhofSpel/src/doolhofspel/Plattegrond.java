package doolhofspel;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

public class Plattegrond {
    private Scanner file;
    private final  int MAPGROOTTE = 21;
    private String[] map = new String[MAPGROOTTE]; // velden
    private Image start;
    
    public Plattegrond() {
        ImageIcon img;
        // KLASSE START maken???? nee toch? hoe dan dit oplossen? 
        // of start gewoon weglaten. start is waar held staat aan begin van het veld
        img = new ImageIcon("Pictures//start.png");
        start = img.getImage();
        
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
    public String getMap(int x, int y) {
        String index = map[y].substring(x, x+1);
        return index;
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
        while (file.hasNext()) {
            for (int i = 0; i < map.length; i++) {  
                map[i] = file.next();
            }
        }
    }
    public void closeFile() {
        file.close();
    }
}

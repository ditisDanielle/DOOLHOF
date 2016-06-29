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
    public ArrayList<Veldbezetting> mapObjects = new ArrayList<>();
    
    public Plattegrond() {
        ImageIcon img;
//        img = new ImageIcon("Pictures//start.png");
        openFile();
        readFile();
        closeFile();
    }
    
    public int getMapgrootte(){
        return this.MAPGROOTTE;
    }
    
    //inlezen veldbezetting
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
        for (int z = 0; z < MAPGROOTTE; z++) {
            String line = file.next();
            for (int y = 0; y < MAPGROOTTE; y++) {
                String veld = line.substring(y,y+1);
                if (veld.equals("g")) {
                    Gras gras = new Gras();
                    gras.setPositie(z,y);
                    mapObjects.add(gras);
                }
                if (veld.equals("w")) {
                    Muur muur = new Muur();
                    muur.setPositie(z,y);
                    mapObjects.add(muur);
                }
                if (veld.equals("b")) {
                    Bazooka bazooka = new Bazooka();
                    bazooka.setPositie(z,y);
                    mapObjects.add(bazooka);
                }
                if (veld.equals("f")) {
                    Vriend vriend = new Vriend();
                    vriend.setPositie(z,y);
                    mapObjects.add(vriend);
                }        
                if (veld.equals("h")) {
                    Helper helper = new Helper();
                    helper.setPositie(z,y);
                    mapObjects.add(helper);
                }
            }
        }
    }      
    
    public ArrayList getMapObjects() {
        return mapObjects;
    }
    
    public void closeFile() {
        file.close();
    }
}

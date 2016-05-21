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
    private Image gras, muur, bazooka, finish, start;
    
    public Plattegrond() {
        ImageIcon img = new ImageIcon("Pictures//gras.png");
        gras = img.getImage(); // 32x32 pixel icons
        img = new ImageIcon("Pictures//brickwall.png");
        muur = img.getImage();
        img = new ImageIcon("Pictures//bazooka.png");
        bazooka = img.getImage();
        img = new ImageIcon("Pictures//finish.png");
        finish = img.getImage();
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
        return gras;
    }
    public Image getMuur() {
        return muur;
    }
    public Image getBazooka() {
        return bazooka;
    }
    public Image getFinish() {
        return finish;
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

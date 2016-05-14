/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhofspel;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Danielle
 */
public class Plattegrond {
    private Scanner file;
    private final  int MAPGROOTTE = 20;
    private String[] map = new String[MAPGROOTTE]; // velden
    private Image gras, muur;
    
    public Plattegrond() {
        ImageIcon img = new ImageIcon("Pictures//gras.png");
        gras = img.getImage(); // 32x32 pixel icons
        img = new ImageIcon("Pictures//muur.png");
        muur = img.getImage();
        
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
    public String getMap(int x, int y) {
        String index = map[y].substring(x, x+1);
        return index;
    }
    public void openFile() {
        try {
            file = new Scanner(new File("Map.txt"));
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

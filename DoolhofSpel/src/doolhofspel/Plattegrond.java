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
    private static Scanner filekaart;
    private static Scanner fileroute;
    private static final int MAPGROOTTE = 21;
    public static ArrayList<Veldbezetting> mapObjects = new ArrayList<>();
    public static ArrayList<Veldbezetting> routeObjects = new ArrayList<>();
    
    // constructor kaart
    public Plattegrond() {
        ImageIcon img;
        img = new ImageIcon("Pictures//start.png");
        String kaart = "kaart.txt";
        openFile(kaart);
        readFile(mapObjects);
        //closeFile(kaart);
        filekaart.close();
    }
    //constructor routekaart
    public Plattegrond(String route){
        ImageIcon img;
        img = new ImageIcon("Pictures//start.png");
        openFile(route);
        readFile(routeObjects);
        //closeFile(route);
        fileroute.close();
    }
    
    public int getMapgrootte(){
        return this.MAPGROOTTE;
    }
    
    public static void arrayAdd(ArrayList<Veldbezetting> objects, Veldbezetting veld){
        objects.add(veld);
    }
    
    
    
    public static ArrayList <Veldbezetting> getMapObjects(){
        return mapObjects;
    }
    
    
    public static ArrayList <Veldbezetting> getRouteObjects(){
        return routeObjects;
    }
    
    
     //inlezen veldbezetting
    public Veldbezetting getMap(int x, int y) {
        int index = x * (MAPGROOTTE) + y;
        return mapObjects.get(index);
    }
    
    
    public static void openFile(String kaart) {
        if (kaart.equals("route.txt")) {

            try {
                fileroute = new Scanner(new File(kaart));
            } catch (Exception e) {
                System.out.println("Error loading map!");
            }
        } else if (kaart.equals("kaart.txt")) {
            try {
                filekaart = new Scanner(new File(kaart));
            } catch (Exception e) {
                System.out.println("Error loading map!");
            }
        }
    }
    
    
    public static void readFile(ArrayList<Veldbezetting> objects) {
        

        for (int x = 0; x < MAPGROOTTE; x++) {
            
            //String line = file.next();
            String line = null;
        if (objects.equals(mapObjects)) {
            line = filekaart.next();
        } else if (objects.equals(routeObjects)) {
            line = fileroute.next();
        }
            
            for (int y = 0; y < MAPGROOTTE; y++) {
                String veld = line.substring(y, y + 1);
                if (veld.equals("g")) {
                    Gras gras = new Gras();
                    gras.setPositie(x, y);
                    //mapObjects.add(gras);
                    arrayAdd(objects, gras);
                }
                if (veld.equals("w")) {
                    Muur muur = new Muur();
                    muur.setPositie(x, y);
                    //mapObjects.add(muur);
                    arrayAdd(objects, muur);
                }
                if (veld.equals("b")) {
                    Bazooka bazooka = new Bazooka();
                    bazooka.setPositie(x, y);
                    //mapObjects.add(bazooka);
                    arrayAdd(objects, bazooka);
                }
                if (veld.equals("f")) {
                    Vriend vriend = new Vriend();
                    vriend.setPositie(x, y);
                    //mapObjects.add(vriend);
                    arrayAdd(objects, vriend);
                }
                if (veld.equals("h")) {
                    Helper helper = new Helper();
                    helper.setPositie(x, y);
                    arrayAdd(objects, helper);
                }
                if (veld.equals("v")) {
                    Valsspeler valsspeler = new Valsspeler();
                    valsspeler.setPositie(x, y);
                    //mapObjects.add(valsspeler);
                    arrayAdd(objects, valsspeler);
                }

                if (veld.equals("X")) {
                    RouteVeld routeveld = new RouteVeld();
                    routeveld.setPositie(x, y);
                    arrayAdd(objects, routeveld);

                }
            }
        }
    }
    
   
}

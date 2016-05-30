package doolhofspel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */
public class Bord extends JPanel implements ActionListener {

    private Timer timer;
    private Plattegrond kaart;
    private Held held;
    private Bazooka bazooka;
    private Vriend vriend;
    private final int IMGBREEDTE = 32; // breedte afbeelding in pixels
    private final int IMGHOOGTE = 32; // breedte afbeelding in pixels
    private ArrayList<Object> mapObjects = new ArrayList<>();
    private int stapX;
    private int stapY;

    public Bord() {
        timer = new Timer(25, this);
        timer.start();
        kaart = new Plattegrond();
        held = new Held();
        bazooka = new Bazooka();
        vriend = new Vriend();
        addKeyListener(new PijltjesListener());
        setFocusable(true);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        int aantal = kaart.getMapgrootte();
         for (int y = 0; y < aantal; y++) {
            for (int x = 0; x < aantal; x++) {
                for (int i = 0; i < aantal; i++) {     
                    // volgens mij doen we het niet goed
                    // we moeten objecten in een array zetten, en die moeten worden uitgelezen
                    // en wellicht ook getekend
                    // plus dat we dan de kortste route kunnen gaan berekenen nav de locatie van een object
                    // maar ik kwam er niet uit, hij wilde niet tekenen nav een object
                    // dus nu maar even zo...
                    if (kaart.getMap(x, y).equals("g")) {
                        g.drawImage(kaart.getGras(), x * IMGBREEDTE, y * IMGHOOGTE, null);
                        Object gras = new Gras();
                        mapObjects.add(gras);
                    }
                    if (kaart.getMap(x, y).equals("w")) {
                        g.drawImage(kaart.getMuur(), x * IMGBREEDTE, y * IMGHOOGTE, null);
                        Object muur = new Muur();
                        mapObjects.add(muur);
                    }
                    if (kaart.getMap(x, y).equals("b")) {
                        g.drawImage(kaart.getBazooka(), x * IMGBREEDTE, y * IMGHOOGTE, null);
                        Object bazooka = new Bazooka();
                        mapObjects.add(bazooka);
                    }
                    if (kaart.getMap(x, y).equals("f")) {
                        
                        Vriend vriend = new Vriend();
                        g.drawImage(vriend.getImage(), x * IMGBREEDTE, y * IMGHOOGTE, null);
                        mapObjects.add(vriend);
                    }        
                    if (kaart.getMap(x, y).equals("s")) {
                        g.drawImage(kaart.getStart(), x * IMGBREEDTE, y * IMGHOOGTE, null);
                    }
                }
            }
        }    
        g.drawImage(held.getImage(), held.getVeldX() * 32, held.getVeldY() * 32, null);
        //repaint();
    }

    public class PijltjesListener extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        // code keyPressed herschreven om deze korter te maken (no redundancy)
        @Override
        public void keyPressed(KeyEvent e) {
            // stap naar rechts of links
            stapX = 0;
            // stap naar boven of naar onderen
            stapY = 0;
            switch (e.getKeyCode()) {
                case KeyEvent.VK_RIGHT:
                    stapX = 1;
                    stapY = 0;
                    break;
                case KeyEvent.VK_LEFT:
                    stapX = -1;
                    stapY = 0;
                    break;
                case KeyEvent.VK_DOWN:
                    stapX = 0;
                    stapY = 1;
                    break;
                case KeyEvent.VK_UP:
                    stapX = 0;
                    stapY = -1;
                    break; 
            }
            // even een aparte method gemaakt, om het overzichtelijk te houden
            lopen(stapX, stapY);
            repaint();
        }  

        public void lopen(int stapX, int stapY) {
            // om objecten toe te voegen hoeven deze nu maar 1x hier toegevoegd te worden
            // in plaats van bij elke stap een keer
            // nu aangeven of er gelopen wordt naar aanleiding van wat we vinden
            // en even aangeven wat we vinden, als er wat gevonden wordt
            // en de equal moet op het object plaats vinden
            if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY).equals("s")) {
                System.out.println("Niet lopen, je zit bij de start");
            }
            else {
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY).equals("f")) {
                    System.out.println("Vriend gevonden!!!");
                }
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY).equals("b")) {
                    System.out.println("Found bazooka!");
                }
                if (!kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY).equals("w")) {
                    held.lopen(stapX, stapY);
                }    
            }
        }
        
        // DIT IS HET ORIGINEEL van het lopen kan weg
//        @Override
//        public void keyPressed(KeyEvent e) {
//            switch (e.getKeyCode()) {
//                case KeyEvent.VK_RIGHT:
//                    if (kaart.getMap(held.getVeldX() + 1, held.getVeldY()).equals("f")) {
//                        System.out.println("Vriend gevonden!!!");
//                        break;
//                    }
//                    if (kaart.getMap(held.getVeldX() + 1, held.getVeldY()).equals("s")) {
//                        System.out.println("Niet lopen, je zit bij de start");
//                        break;
//                    }
//                    if (kaart.getMap(held.getVeldX() + 1, held.getVeldY()).equals("b")) {
//                        // method bazooka
//                        System.out.println("Found bazooka!");
//                    }
//                    if (!kaart.getMap(held.getVeldX() + 1, held.getVeldY()).equals("w")) {
//                        held.lopen(1, 0);
//                        System.out.println("right...");
//                    }
//                    break;
//
//                case KeyEvent.VK_LEFT:
//                    if (kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("f")) {
//                        System.out.println("Vriend gevonden!!!");
//                        break;
//                    }
//                    // let op: toevoegen aan alle keyacties, startveld positie kan wijzigen!
//                    if (kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("s")) {
//                        System.out.println("Niet lopen, je zit bij de start");
//                        break;
//                    }
//                    if (kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("b")) {
//                        // method bazooka
//                        System.out.println("Found bazooka!");
//                    }
//                    if (!kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("w")) {
//                        held.lopen(-1, 0);
//                        System.out.println("left...");
//
//                    }
//                    break;
//
//                case KeyEvent.VK_DOWN:
//                    if (kaart.getMap(held.getVeldX(), held.getVeldY() + 1).equals("f")) {
//                        System.out.println("Vriend gevonden!!!");
//                        break;
//                    }
//                    if (kaart.getMap(held.getVeldX(), held.getVeldY() + 1).equals("s")) {
//                        System.out.println("Niet lopen, je zit bij de start");
//                        break;
//                    }
//                    if (kaart.getMap(held.getVeldX(), held.getVeldY() + 1).equals("b")) {
//                        // method bazooka
//                        System.out.println("Found bazooka!");
//                    }
//                    if (!kaart.getMap(held.getVeldX(), held.getVeldY() + 1).equals("w")) {
//                        held.lopen(0, 1);
//                        System.out.println("down...");
//                    }
//                    break;
//
//                case KeyEvent.VK_UP:
//                    if (kaart.getMap(held.getVeldX(), held.getVeldY() - 1).equals("f")) {
//                        System.out.println("Vriend gevonden!!!");
//                        break;
//                    }
//                    if (kaart.getMap(held.getVeldX(), held.getVeldY() - 1).equals("s")) {
//                        System.out.println("Niet lopen, je zit bij de start");
//                        break;
//                    }
//                    if (kaart.getMap(held.getVeldX(), held.getVeldY() - 1).equals("b")) {
//                        // method bazooka
//                        System.out.println("Found bazooka!");
//                    }
//                    if (!kaart.getMap(held.getVeldX(), held.getVeldY() - 1).equals("w")) {
//                        System.out.println("up...");
//                        held.lopen(0, -1);
//                    }
//                    break;
//            }
//        }

        @Override
        public void keyReleased(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}

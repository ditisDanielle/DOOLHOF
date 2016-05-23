package doolhofspel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
    private final int IMGBREEDTE = 32; // breedte afbeelding in pixels
    private final int IMGHOOGTE = 32; // breedte afbeelding in pixels

    public Bord() {
        timer = new Timer(25, this);
        timer.start();
        kaart = new Plattegrond();
        held = new Held();
        bazooka = new Bazooka();
        addKeyListener(new PijltjesListener());
        setFocusable(true);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        int aantal = kaart.getMapgrootte();
        // y is the row, x the column
        for (int y = 0; y < aantal; y++) {
            for (int x = 0; x < aantal; x++) {
                if (kaart.getMap(x, y).equals("g")) {
                    g.drawImage(kaart.getGras(), x * IMGBREEDTE, y * IMGHOOGTE, null); // het aantal pixels van het plaatje
                }
                if (kaart.getMap(x, y).equals("w")) {
                    g.drawImage(kaart.getMuur(), x * IMGBREEDTE, y * IMGHOOGTE, null); // het aantal pixels van het plaatje
                }
                if (kaart.getMap(x, y).equals("b")) {
                    g.drawImage(kaart.getBazooka(), x * IMGBREEDTE, y * IMGHOOGTE, null); // het aantal pixels van het plaatje
                }
                if (kaart.getMap(x, y).equals("f")) {
                    g.drawImage(kaart.getVriend(), x * IMGBREEDTE, y * IMGHOOGTE, null); // het aantal pixels van het plaatje
                }
                if (kaart.getMap(x, y).equals("s")) {
                    g.drawImage(kaart.getStart(), x * IMGBREEDTE, y * IMGHOOGTE, null); // het aantal pixels van het plaatje
                }
            }
        }

        g.drawImage(held.getHeld(), held.getVeldX() * 32, held.getVeldY() * 32, null);
        //repaint();
    }

    public class PijltjesListener extends KeyAdapter { // je kunt dit beter in een inner class zetten in PanelenFrame zie boek blz473

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_RIGHT:
                    if (kaart.getMap(held.getVeldX() + 1, held.getVeldY()).equals("f")) { // vriend gevonden!
                        System.out.println("Vriend gevonden!!!");
                        break;
                    }
                    if (kaart.getMap(held.getVeldX() + 1, held.getVeldY()).equals("b")) { // bevat het veld een bazooka?
                        // method bazooka
                        System.out.println("Found bazooka!");
                    }
                    if (!kaart.getMap(held.getVeldX() + 1, held.getVeldY()).equals("w")) { // als het object GEEN muur is, dan lopen
                        held.lopen(1, 0);
                        System.out.println("right...");
                    }
                    break;
                case KeyEvent.VK_LEFT:
                    if (kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("f")) { // vriend gevonden!
                        System.out.println("Vriend gevonden!!!");
                        break;
                    }
                    // let op: toevoegen aan alle keyacties, startveld positie kan wijzigen!
                    if (kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("s")) { // is het begin van de Game?
                        System.out.println("Niet lopen, je zit bij de start");
                        break;
                    }
                    if (kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("b")) { // bevat het veld een bazooka?
                        // method bazooka
                        System.out.println("Found bazooka!");
                    }
                    if (!kaart.getMap(held.getVeldX() - 1, held.getVeldY()).equals("w")) { // als het object GEEN muur is, dan lopen
                        held.lopen(-1, 0);
                        System.out.println("left...");
                        
                    }
                break;
                case KeyEvent.VK_DOWN:
                     if (kaart.getMap(held.getVeldX(), held.getVeldY() + 1).equals("f")) { // vriend gevonden!
                        System.out.println("Vriend gevonden!!!");
                        break;
                    }
                    if (kaart.getMap(held.getVeldX(), held.getVeldY() + 1).equals("b")) { // bevat het veld een bazooka?
                        // method bazooka
                        System.out.println("Found bazooka!");
                    }
                    if (!kaart.getMap(held.getVeldX(), held.getVeldY() + 1).equals("w")) { // als het object GEEN muur is, dan lopen
                        held.lopen(0, 1);
                        System.out.println("down...");
                    }
                break;
                case KeyEvent.VK_UP:
                     if (kaart.getMap(held.getVeldX(), held.getVeldY() -1).equals("f")) { // vriend gevonden!
                        System.out.println("Vriend gevonden!!!");
                        break;
                    }
                    if (kaart.getMap(held.getVeldX(), held.getVeldY() - 1).equals("b")) { // bevat het veld een bazooka?
                        // method bazooka
                        System.out.println("Found bazooka!");
                    }
                    if (!kaart.getMap(held.getVeldX(), held.getVeldY() - 1).equals("w")) { // als het object GEEN muur is, dan lopen
                        held.lopen(0, -1);
                        System.out.println("up...");
                    }
                break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}

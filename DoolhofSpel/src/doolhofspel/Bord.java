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
    // zie commentaar over bazooka bij de constructor
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
        // Deze zou weg kunnen, maar dan krijg ik de method schieten in bazooka niet
        // die zou dan onder speler moeten denk ik
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
        for (int x = 0; x < 21; x++) {
            for (int y = 0; y < 21; y++) {
                Veldbezetting veld = kaart.getMap(x, y);
                g.drawImage(veld.getImage(), x * IMGBREEDTE, y * IMGHOOGTE, null);
            }
            g.drawImage(held.getImage(), held.getVeldX() * 32, held.getVeldY() * 32, null);
            //repaint();
        }  
    }

    public class PijltjesListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
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
            // geen idee of deze al werkt, ik bedoel de speler dus, ff testen!
            if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Speler) {
                System.out.println("Niet lopen, je zit bij de start");
            }
            else {
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Vriend) {
                    System.out.println("Vriend gevonden!!!");
                }
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Bazooka) {
                    System.out.println("Found bazooka!");
                    bazooka.activeerSchietknop();
                }
                if(!(kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY)instanceof Muur)) {
                    System.out.println("we lopen");
                    held.lopen(stapX, stapY);
                }
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

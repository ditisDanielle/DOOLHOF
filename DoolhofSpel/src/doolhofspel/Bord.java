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
    private int stappenteller;
    // zie commentaar over bazooka bij de constructor
    private Bazooka bazooka;
    private Vriend vriend;
    private final int IMGBREEDTE = 32; // breedte afbeelding in pixels
    private final int IMGHOOGTE = 32; // breedte afbeelding in pixels
    private int stapX;
    private int stapY;
    Doolhof doolhof;

    
    public Bord(Doolhof doolhof) {
        timer = new Timer(25, this);
        timer.start();
        kaart = new Plattegrond();
        held = new Held();
        // Deze zou weg kunnen, maar dan krijg ik de method schieten in bazooka niet aan de praat
        // die zou onder speler moeten
        bazooka = new Bazooka();
        vriend = new Vriend();
        addKeyListener(new PijltjesListener());
        setFocusable(true);
        this.doolhof = doolhof;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int x = 0; x < 21; x++) {
            for (int y = 0; y < 21; y++) {
                Veldbezetting veld = kaart.getMap(x, y);
                g.drawImage(veld.getImage(), x * IMGBREEDTE, y * IMGHOOGTE, null);
            }
            g.drawImage(held.getImage(), held.getVeldX() * 32, held.getVeldY() * 32, null);
        }  
    }

    public class PijltjesListener extends KeyAdapter {
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
            checkVeld(stapX, stapY);
            telStap();
            repaint();
        }  

        public void checkVeld(int stapX, int stapY) {
            if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Held){
                System.out.println("Niet lopen, je zit bij de start");
            }
            else {
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Vriend) {
                    System.out.println("Vriend gevonden!!!");
                }
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Bazooka) {
                    System.out.println("Found bazooka!");
                    //held.pakBazooka();
                    activeerSchietknop();
                }
                if(!(kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY)instanceof Muur)) {
                    System.out.println("we lopen");
                    held.lopen(stapX, stapY);
                }
            }
        }
        
        private void telStap() {
            stappenteller++;
            try {
                doolhof.setTeller(stappenteller);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        public void activeerSchietknop() {
            ArrayList findBazooka = kaart.getMapObjects();
            doolhof.switchVisibilitySchietknop(true);
            // de code hieronder moet naar bazooka
            for (int i = 0; i < findBazooka.size(); i++) {
                String value = findBazooka.get(i).toString();
                if (value.contains("Bazooka")) {
                    System.out.println("Found bazooka in de ArrayList");
                    findBazooka.remove(i);
                    Gras gras = new Gras();
                    findBazooka.add(i, gras);
                }
            }
        }
        
        public void bazookaNaarGras( int x, int y){
            Gras gras = new Gras();
            bazooka.setImage(gras.getImage());
            bazooka.setPositie(x, y);
            repaint();
        }

        public void deactiveerSchietnkop() {
            doolhof.switchVisibilitySchietknop(false);
        }
        
        // deze code moet naar held en aangepast, want zo gaat ie natuurlijk niet werken
//        public void bazookaSchiet(Held held, int stapX, int stapY) {
//            ArrayList schiet = kaart.getMapObjects();
//            if (stapX, stapY) instanceof Muur)) {
//                int muurPos = stapX, stapY;
//                schiet.remove(muurPos);
//                Gras gras = new Gras();
//                schiet.add(muurPos, gras);
//            }
//        }
    }

}

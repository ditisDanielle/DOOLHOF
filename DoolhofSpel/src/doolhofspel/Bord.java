package doolhofspel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */
public class Bord extends JPanel implements ActionListener {

    private final Plattegrond kaart;
    private final Held held;
    private final Gras gras;
    private int stappenteller;
    private final int VELDBREEDTE = 32; // breedte afbeelding in pixels
    private final int VELDHOOGTE = 32; // breedte afbeelding in pixels
    private int stapX;
    private int stapY;
    Doolhof doolhof;

    public Bord(Doolhof doolhof) {
        kaart = new Plattegrond();
        held = new Held();
        gras = new Gras();
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
                // als we hier een helper vinden, deze niet tekenen
                // deze wordt pas zichtbaar als de held de helper tegenkomt
                // in plaats daarvan tekenen we een grasje
                // het is wel een beetje jammer dat het me niet lukt om de 
                // "veldbezetting te herkennen"
                // Danielle, dit commentaar mag wel weg natuurlijk, haha :-)
                String plaatje = veld.toString();
                if (plaatje.contains("Helper")) {
                    Image grasje = gras.getImage();
                    g.drawImage(grasje, x * VELDBREEDTE, y * VELDHOOGTE, null);
                }
                else {
                    g.drawImage(veld.getImage(), x * VELDBREEDTE, y * VELDHOOGTE, null);
                }
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
                    held.setRichting("right");
                    break;
                case KeyEvent.VK_LEFT:
                    stapX = -1;
                    stapY = 0;
                    held.setRichting("left");
                    break;
                case KeyEvent.VK_DOWN:
                    stapX = 0;
                    stapY = 1;
                    held.setRichting("down");
                    break;
                case KeyEvent.VK_UP:
                    stapX = 0;
                    stapY = -1;
                    held.setRichting("up");
                    break;
            }
            // een aparte method gemaakt, om het overzichtelijk te houden
            checkVeld(stapX, stapY);
            repaint();
        }

        public void checkVeld(int stapX, int stapY) {
            // afvangen
            if (held.getVeldX() + stapX == 21 || held.getVeldY() + stapY == 21) {
                System.out.println("OUT OF RANGE");
            }
            if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Held) {
                System.out.println("Niet lopen, je zit bij de start");
            } 
            else 
            {
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Vriend) {
                    System.out.println("Vriend gevonden!!!");
                }
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Helper) {
                    System.out.println("Helper gevonden!!!");
                    // stappenteller redux (bestaat nog niet)
                    // of moest deze nou alleen de kortste route tonen? confused now
                    // daarna naar changeImage, het grasveld moet een helperveld worden
                    int helperX = held.getVeldX() + stapX;
                    int helperY = held.getVeldY() + stapY;
                    String whatsIt = "helper";
                    changeImage(helperX, helperY, whatsIt);
                }
                if (kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Bazooka) {
                    activeerSchietknop();
                    int bazookaX = held.getVeldX() + stapX;
                    int bazookaY = held.getVeldY() + stapY;
                    String whatsIt = "bazooka";
                    changeImage(bazookaX, bazookaY, whatsIt);
                }   
                if (!(kaart.getMap(held.getVeldX() + stapX, held.getVeldY() + stapY) instanceof Muur)) {
                    held.lopen(stapX, stapY);
                    telStap();
                }
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

    // dit moet nog wel korter kunnen, liever geen herhalingen
    // nu even geen tijd meer over
    public void changeImage(int X, int Y, String whatsIt) {
        ArrayList copykaart = kaart.getMapObjects();
        int i = 0;
        if (whatsIt.equals("bazooka")) {
            while (i < copykaart.size()) {
                Veldbezetting A = kaart.mapObjects.get(i);
                int x = A.getX(i);
                int y = A.getY(i);
                if (x == X && y == Y) {
    //                System.out.println("positie in arraylist copykaart " + (i));
    //                System.out.println("old image : " + copykaart.get(i));
                    copykaart.remove(i);
                    Gras gras = new Gras();
                    copykaart.add(i, gras);
    //                System.out.println("positie in arraylist copykaart " + (i));
    //                System.out.println("new image :" + copykaart.get(i));
                } 
                else {
                    i++;
                }
            }
        }
        if (whatsIt.equals("helper")) {
            // hier  kom je wel ale je een helper tegenkomt
            // maar plaatje wordt niet geupdate naar een helper :-(
            while (i < copykaart.size()) {
                Veldbezetting A = kaart.mapObjects.get(i);
                int x = A.getX(i);
                int y = A.getY(i);
                if (x == X && y == Y) {
    //                System.out.println("positie in arraylist copykaart " + (i));
    //                System.out.println("old image : " + copykaart.get(i));
                    copykaart.remove(i);
                   Helper helper = new Helper();
                    copykaart.add(i, helper);
    //                System.out.println("positie in arraylist copykaart " + (i));
    //                System.out.println("new image :" + copykaart.get(i));
                } 
                else {
                    i++;
                }
            }    
        }
        repaint();
    }

    public void activeerSchietknop() {
        doolhof.switchVisibilitySchietknop(true);
    }

    public void deactiveerSchietnkop() {
        doolhof.switchVisibilitySchietknop(false);
    }

    public void activeerSchietActie() {
        String whatsIt = "bazooka";
        held.schieten(held.getVeldX(), held.getVeldY());
        changeImage(held.getSchietTargetX(), held.getSchietTargetY(), whatsIt);
    }

    public void printPosities() {
        ArrayList tempprint = kaart.getMapObjects();
        int x = 0;
        int y = 0;
        for (int i = 0; i < tempprint.size(); i++) {
            Veldbezetting A = kaart.mapObjects.get(i);
            x = A.getX(i);
            y = A.getY(i);
            String pos = Integer.toString(x) + Integer.toString(y);
            System.out.println(pos);
            System.out.println("pos :" + i + "/stringxy " + pos + " object= " + tempprint.get(i) + " x: " + x + "y: " + y);
        }
    }
    
}

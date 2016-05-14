/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhofspel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Danielle
 */
public class Bord extends JPanel implements ActionListener {

    private Timer timer;
    private Plattegrond kaart;
    private Held held;
    private final int IMGBREEDTE = 32; // breedte afbeelding in pixels
    private final int IMGHOOGTE = 32; // breedte afbeelding in pixels

    public Bord() {
        timer = new Timer(25, this);
        timer.start();
        kaart = new Plattegrond();
        held = new Held();
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
            }
        }
        
        g.drawImage(held.getHeld(), held.getVeldX()*32, held.getVeldY()*32, null);
        //repaint();
    }

    public class PijltjesListener extends KeyAdapter { // je kunt dit beter in een inner class zetten in PanelenFrame zie boek blz473

        @Override
        public void keyTyped(KeyEvent e) {
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //int keyCode = e.getKeyCode();
            switch (e.getKeyCode()) {
                case KeyEvent.VK_RIGHT:
                    held.lopen(1, 0);
                    System.out.println("right...");
                    break;
                case KeyEvent.VK_LEFT:
                    held.lopen( -1, 0);
                    System.out.println("left...");
                    break;
                case KeyEvent.VK_DOWN:
                    held.lopen(0, 1);
                    System.out.println("down...");
                    break;
                case KeyEvent.VK_UP:
                    held.lopen(0, -1);
                    System.out.println("up...");
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhofspel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Danielle
 */
public class Bord extends JPanel implements ActionListener {
    private Plattegrond kaart;
    private final int IMGBREEDTE = 32; // breedte afbeelding in pixels
    private final int IMGHOOGTE = 32; // breedte afbeelding in pixels
    public Bord() {
        kaart = new Plattegrond();
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
                    g.drawImage(kaart.getGras(), x*IMGBREEDTE, y*IMGHOOGTE, null); // het aantal pixels van het plaatje
                }
                if (kaart.getMap(x, y).equals("w")) { 
                    g.drawImage(kaart.getMuur(), x*IMGBREEDTE, y*IMGHOOGTE, null); // het aantal pixels van het plaatje
                }
            }
        }
    }
    
}


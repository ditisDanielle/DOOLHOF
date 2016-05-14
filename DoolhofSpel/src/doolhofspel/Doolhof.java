/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doolhofspel;

import javax.swing.JFrame;

/**
 *
 * @author Agnita & Danielle
 */
class Doolhof {

    public Doolhof() {
    JFrame frame = new JFrame();
        frame.setTitle("Zoek je vriend!");
        frame.add(new Bord());
        frame.setSize(688, 696);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}

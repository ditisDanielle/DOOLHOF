package doolhofspel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */
class Doolhof {

    int buttonSizeHeight = 1; // later FINAL maken
    int buttonSizesWidth = 3;// later FINAL maken
    JFrame spelframe;
    JPanel gamepanel;
    JPanel buttonpanel;
    JPanel oostpanel;
    JPanel dummy1;
    JPanel dummy2;
    JPanel dummy3;
    JPanel dummy4;
    JButton reset;
/// BUTTON IN EEN APARTE PANEL > PANEL IN CENTER VAN BORDERLAYOUT BUTTONPANEL 
    
    
    public Doolhof() {
        // maak een gameframe
        spelframe = new JFrame();
        spelframe.setTitle("Zoek je vriend!");
        spelframe.setSize(1000, 1000);
        spelframe.setLocationRelativeTo(null);
        spelframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set layouts
        gamepanel = new JPanel(new GridLayout(1, 2));
        buttonpanel = new JPanel(new BorderLayout());
        oostpanel = new JPanel(new BorderLayout());

        //button
        reset = new JButton();
        reset.setSize(buttonSizeHeight, buttonSizesWidth);
        reset.setText("Reset");
        
        // actie toevoegen aan de resetbutton!
        reset.addActionListener(null);

        buttonpanel.add(reset, BorderLayout.CENTER);

        // dummy panels toevoegen ivm de layout
        dummy1 = new JPanel();
        dummy1.setPreferredSize(new Dimension(50, 300));
        buttonpanel.add(dummy1, BorderLayout.NORTH);
        dummy2 = new JPanel();
        dummy2.setPreferredSize(new Dimension(50, 300));
        buttonpanel.add(dummy2, BorderLayout.SOUTH);
        dummy3 = new JPanel();
        dummy3.setPreferredSize(new Dimension(50, 350));
        buttonpanel.add(dummy3, BorderLayout.EAST);
        dummy4 = new JPanel();
        dummy4.setPreferredSize(new Dimension(50, 350));
        buttonpanel.add(dummy4, BorderLayout.WEST);

        // alle panels toevoegen aan het uiteindelijke gamepanel
        gamepanel.add(new Bord());
        gamepanel.add(oostpanel);
        oostpanel.add(buttonpanel, BorderLayout.CENTER);

        // als laatste voegen we de gamepanel toe aan de gameframe en zorgen we dat het zichtbaar is
        spelframe.add(gamepanel);
        spelframe.setVisible(true);
    }
}

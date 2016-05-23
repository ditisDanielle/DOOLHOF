package doolhofspel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Agnita & Danielle (Groep 7)
 */

class Doolhof {
    int buttonSizeHeight;
    int buttonSizesWidth;
      
    public Doolhof() {
        // maak een gameframe
        JFrame frame = new JFrame();
        frame.setTitle("Zoek je vriend!");
        frame.setSize(1000, 1000);
        // frame.setSize(694, 728); // eerste int is breedte, tweede is lengte, deze maat graag even bewaren!
        // beter is om de framesize relatief te maken aan de plaatjes (32x32)
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // maak de gamepanel
        JPanel gamepanel = new JPanel(new BorderLayout());
        // twee fakepanels, nodig voor de layout (north & south)
        JPanel north = new JPanel();
        north.setPreferredSize(new Dimension(5, 50));
        JPanel south = new JPanel();
        south.setPreferredSize(new Dimension(5, 250));
        // een buttonpanel voor de start en de reset buttons
        JPanel buttonPanel = new JPanel(new BorderLayout());
        // startbutton toevoegen
        JButton start = new JButton();
        // actie toevoegen aan de startbutton!
        start.addActionListener(null);
        start.setText("Start");
        start.setSize(buttonSizeHeight, buttonSizesWidth);
        buttonPanel.add(start, BorderLayout.NORTH);
        // resetbutton toevoegen
        JButton reset = new JButton();
        // actie toevoegen aan de resetbutton!
        reset.addActionListener(null);
        reset.setText("Reset");
        reset.setSize(buttonSizeHeight, buttonSizesWidth);
        buttonPanel.add(reset, BorderLayout.SOUTH);
        // fake panel toevoegen ivm de layout
        JPanel fakePanel = new JPanel();
        buttonPanel.add(fakePanel, BorderLayout.CENTER);
        // nog zo'n fakepanel
        JPanel west = new JPanel();
        west.setPreferredSize(new Dimension(50, 50));
        // alle panels toevoegen aan het uiteindelijke gamepanel
        gamepanel.add(new Bord(), BorderLayout.CENTER);
        gamepanel.add(north, BorderLayout.NORTH);
        gamepanel.add(south, BorderLayout.SOUTH);
        gamepanel.add(buttonPanel, BorderLayout.EAST);
        gamepanel.add(west, BorderLayout.WEST);
        // als laatste voegen we de gamepanel toe aan de gameframe en zorgen we dat het zichtbaar is
        frame.add(gamepanel);
        frame.setVisible(true);
    }
}

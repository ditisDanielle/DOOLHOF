package doolhofspel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JPanel centerdummy;
    JButton reset;
    JButton schietKnop;

    
/// BUTTON IN EEN APARTE PANEL > PANEL IN CENTER VAN BORDERLAYOUT BUTTONPANEL 

    public Doolhof() {
        // maak een gameframe
        spelframe = new JFrame();
        spelframe.setTitle("Zoek je vriend!");
        //spelframe.setSize(1000, 1000);
        	
        spelframe.setExtendedState(Frame.MAXIMIZED_BOTH);
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
        
        // schietknop toevoegen, maar als het goed is niet zichtbaar tot we een bazooka vinden
        schietKnop = new JButton();
        schietKnop.setSize(buttonSizeHeight, buttonSizesWidth);
        schietKnop.setText("Schieten!");
        schietKnop.setVisible(false);
        ActionListener listener = new ClickListener();
        schietKnop.addActionListener(listener);
        
        // actie toevoegen aan de resetbutton!
        // zetten we de actionlistener inhoudelijke code hier? of elders? (onder bord?)
        // niet te moeilijk doen, poppetje gewoon weer aan het begin zetten, anders "gewoon" opnieuw inlezen de boel
        reset.addActionListener(null);

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

        centerdummy = new JPanel();
        centerdummy.setPreferredSize(new Dimension(50, 350));
        buttonpanel.add(centerdummy, BorderLayout.CENTER);
        centerdummy.add(reset, BorderLayout.CENTER);
        centerdummy.add(schietKnop, BorderLayout.EAST);

        // alle panels toevoegen aan het uiteindelijke gamepanel
        gamepanel.add(new Bord());
        gamepanel.add(oostpanel);
        oostpanel.add(buttonpanel, BorderLayout.CENTER);

        // als laatste voegen we de gamepanel toe aan de gameframe en zorgen we dat het zichtbaar is
        spelframe.add(gamepanel);
        spelframe.setVisible(true);
        
        
    }
    
    public class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("I was clicked.");
        }
    }
    
}

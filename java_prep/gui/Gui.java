import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;


public class Gui extends JFrame {
    public Gui() {
        


    }

    public static void main(String []args) throws Exception {
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        JFrame Fenetre = new JFrame();
    }
}
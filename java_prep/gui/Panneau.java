import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g) {
        System.out.println("Je suis executée !!!");
        g.fillOval(20,20,75,75);
    }

    public static void main(String[]args) {
        
    }
}
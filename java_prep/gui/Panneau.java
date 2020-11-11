import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g) {
        System.out.println("Je suis executée !!!");
        int x = this.getWidth();
        int y = this.getHeight();

        System.out.println(x);
        System.out.println(y);
        g.drawString("Le choco c'est bon !",x/4,y/2);
    }

    public static void main(String[]args) {
        
    }
}
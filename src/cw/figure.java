package cw;
import javax.swing.*;
import java.awt.*;
public class figure extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Head
        g.drawOval(100,60,80,80);

        // Eyes
        g.drawOval(115,85,10,10);
        g.drawOval(150,85,10,10);

        // Smile
        g.drawArc(120,100,40,20,180,180);

        // Hat
        g.drawLine(90,60,190,60);
        g.drawLine(90,60,140,20);
        g.drawLine(190,60,140,20);

        // Body
        g.drawRect(100,140,80,120);

        // Legs
        g.drawLine(120,260,120,320);
        g.drawLine(160,260,160,320);

        // Shoes
        g.drawRect(105,320,30,20);
        g.drawRect(145,320,30,20);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Figure");
        figure panel = new figure();

        f.add(panel);
        f.setSize(300,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
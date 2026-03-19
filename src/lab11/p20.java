//Write a Swing application that simulates a traffic signal using
//colored circles.
package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class p20 extends JPanel {
    int state = 0;
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(state==0?Color.RED:Color.GRAY);
        g.fillOval(100,30,50,50);

        g.setColor(state==1?Color.YELLOW:Color.GRAY);
        g.fillOval(100,90,50,50);

        g.setColor(state==2?Color.GREEN:Color.GRAY);
        g.fillOval(100,150,50,50);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Traffic");
        p20 p = new p20();
        JButton b = new JButton("Change");
        b.setBounds(90,220,100,30);
        f.add(p); f.add(b);
        p.setBounds(50,20,200,200);
        b.addActionListener(e -> {
            p.state = (p.state+1)%3;
            p.repaint();
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        });
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

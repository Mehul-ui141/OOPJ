//Write a program where clicking different buttons displays
//different panels using CardLayout.
package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p18 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Cards");

        CardLayout cl = new CardLayout();
        JPanel p = new JPanel(cl);

        JPanel p1 = new JPanel(); p1.add(new JLabel("Panel 1"));
        JPanel p2 = new JPanel(); p2.add(new JLabel("Panel 2"));

        p.add(p1,"1");
        p.add(p2,"2");

        JButton b1 = new JButton("Show 1");
        JButton b2 = new JButton("Show 2");

        b1.setBounds(50,10,100,30);
        b2.setBounds(170,10,100,30);
        p.setBounds(50,50,200,100);

        f.add(b1); f.add(b2); f.add(p);

        b1.addActionListener(e -> cl.show(p,"1"));
        b2.addActionListener(e -> cl.show(p,"2"));

        f.setSize(350,250);
        f.setLayout(null);
        f.setVisible(true);

        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

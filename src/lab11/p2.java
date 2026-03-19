//Design a Swing application that changes the background color of
//the window randomly whenever a button is pressed.
package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class p2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Color Changer");
        JButton b = new JButton("Change Color");
        b.setBounds(100, 100, 150, 40);
        f.add(b);
        Random r = new Random();
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int red = r.nextInt(256);
                int green = r.nextInt(256);
                int blue = r.nextInt(256);
                f.getContentPane().setBackground(new Color(red, green, blue));
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
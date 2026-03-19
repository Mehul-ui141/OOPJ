//Write a Swing program that enables or disables buttons
//depending on user interaction.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Enable Disable");
        JButton b1 = new JButton("Enable");
        JButton b2 = new JButton("Disable Me");
        b1.setBounds(80, 80, 100, 30);
        b2.setBounds(200, 80, 120, 30);
        f.add(b1);
        f.add(b2);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2.setEnabled(true);
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2.setEnabled(false);
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
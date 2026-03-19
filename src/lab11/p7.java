//Create a Swing application that counts how many times a button
//has been clicked.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p7 {
    static int count = 0;
    public static void main(String[] args) {
        JFrame f = new JFrame("Click Counter");
        JButton b = new JButton("Click");
        JLabel l = new JLabel("Count: 0");
        b.setBounds(120, 80, 120, 30);
        l.setBounds(130, 130, 150, 30);
        f.add(b);
        f.add(l);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                l.setText("Count: " + count);

                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
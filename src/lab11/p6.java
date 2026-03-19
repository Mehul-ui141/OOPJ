//Write a Swing program where a label moves across the screen
//when a button is pressed.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p6 {
    static int x = 10;
    public static void main(String[] args) {
        JFrame f = new JFrame("Moving Label");
        JLabel l = new JLabel("Moving Text");
        JButton b = new JButton("Move");
        l.setBounds(x, 100, 100, 30);
        b.setBounds(120, 200, 100, 30);
        f.add(l);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Timer t = new Timer(50, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        x += 5;
                        l.setBounds(x, 100, 100, 30);
                        System.out.println("Mehul Jha");
                        System.out.println("2405287");
                        if (x > 300) {
                            ((Timer)e.getSource()).stop();
                        }
                    }
                });
                t.start();
            }
        });
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
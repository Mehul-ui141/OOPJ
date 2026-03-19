//Design a GUI where clicking a button dynamically adds new
//buttons to the window.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p5 {
    static int y = 50;
    public static void main(String[] args) {
        JFrame f = new JFrame("Add Buttons");
        JButton addBtn = new JButton("Add Button");
        addBtn.setBounds(100, 10, 150, 30);
        f.add(addBtn);
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = new JButton("New");
                b.setBounds(100, y, 100, 30);
                f.add(b);
                y += 40;
                f.revalidate();
                f.repaint();
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        f.setSize(350, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//Write a program that creates a dynamic menu bar where menu
//items trigger different actions.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p13 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu");

        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("Options");

        JMenuItem i1 = new JMenuItem("Hello");
        JMenuItem i2 = new JMenuItem("Exit");

        i1.addActionListener(e -> JOptionPane.showMessageDialog(f,"Hello!"));
        i2.addActionListener(e -> System.exit(0));

        m.add(i1); m.add(i2);
        mb.add(m);
        f.setJMenuBar(mb);

        f.setSize(300,200);
        f.setVisible(true);

        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
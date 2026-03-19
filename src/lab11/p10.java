//Write a Swing application that displays a confirmation dialog
//before closing the window.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Confirm Exit");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int choice = JOptionPane.showConfirmDialog(
                        f, "Do you want to exit?", "Confirm",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.out.println("Mehul Jha");
                    System.out.println("2405287");
                    System.exit(0);
                }
            }
        });
    }
}

//Create a Swing program that displays the current system time
//and updates it every second.
package lab11;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class p3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Clock");
        JLabel l = new JLabel();
        l.setBounds(100, 100, 200, 30);
        f.add(l);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Timer t = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                l.setText(sdf.format(d));

                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        t.start();
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
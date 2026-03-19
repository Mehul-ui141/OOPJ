//Design a GUI that changes the font size and color of text
//dynamically based on user selection.
package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class p9 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Font Changer");
        JLabel l = new JLabel("Hello world");
        l.setBounds(100, 50, 200, 30);
        String sizes[] = {"12", "18", "24", "30"};
        JComboBox<String> cb = new JComboBox<>(sizes);
        cb.setBounds(50, 120, 80, 30);
        String colors[] = {"Red", "Blue", "Green"};
        JComboBox<String> cb2 = new JComboBox<>(colors);
        cb2.setBounds(150, 120, 100, 30);
        f.add(l); f.add(cb); f.add(cb2);
        ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int size = Integer.parseInt((String)cb.getSelectedItem());
                l.setFont(new Font("Arial", Font.PLAIN, size));
                String c = (String)cb2.getSelectedItem();
                if(c.equals("Red")) l.setForeground(Color.RED);
                if(c.equals("Blue")) l.setForeground(Color.BLUE);
                if(c.equals("Green")) l.setForeground(Color.GREEN);
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        };
        cb.addActionListener(a);
        cb2.addActionListener(a);
        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

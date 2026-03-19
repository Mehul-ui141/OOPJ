//Design a GUI that loads and displays an image selected by the user.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p14 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Image Loader");
        JLabel l = new JLabel();
        JButton b = new JButton("Load Image");
        b.setBounds(100,20,120,30);
        l.setBounds(50,70,200,150);
        f.add(b); f.add(l);
        b.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            if(fc.showOpenDialog(f)==JFileChooser.APPROVE_OPTION){
                l.setIcon(new ImageIcon(fc.getSelectedFile().getPath()));
            }
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        });
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
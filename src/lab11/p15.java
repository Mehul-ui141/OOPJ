//Write a Swing application that changes the window theme
//using radio buttons.
package lab11;
import javax.swing.*;
import java.awt.*;
public class p15 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Theme");
        JRadioButton r1 = new JRadioButton("Light");
        JRadioButton r2 = new JRadioButton("Dark");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        r1.setBounds(50,50,100,30);
        r2.setBounds(150,50,100,30);
        f.add(r1); f.add(r2);
        r1.addActionListener(e -> f.getContentPane().setBackground(Color.WHITE));
        r2.addActionListener(e -> f.getContentPane().setBackground(Color.GRAY));
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
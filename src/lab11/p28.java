//Develop a Swing application that allows users to drag and drop
//components within the window.
package lab11;
import javax.swing.*;
import java.awt.event.*;

public class p28 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Drag Drop");

        JButton b = new JButton("Drag");
        b.setBounds(100,100,100,30);

        f.add(b);

        b.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                b.setLocation(b.getX()+e.getX(), b.getY()+e.getY());

                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

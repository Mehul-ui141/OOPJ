package cw.Assignment;
import java.awt.*;
import javax.swing.*;
public class p11 extends JFrame {
    public p11(){
        super("BorderLayout Demo");
        setLayout(new BorderLayout());
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("Center"),BorderLayout.CENTER);
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String args[]){
        p11 app = new p11();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
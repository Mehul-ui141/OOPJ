package cw.Assignment;
import java.awt.*;
import javax.swing.*;
public class p12 extends JFrame {
    public p12(){
        super("GridLayout Demo");
        setLayout(new GridLayout(2,3));
        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("Button4"));
        add(new JButton("Button5"));
        add(new JButton("Button6"));
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String args[]){
        p12 app = new p12();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
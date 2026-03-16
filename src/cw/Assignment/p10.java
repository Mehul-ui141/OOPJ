package cw.Assignment;
import java.awt.*;
import javax.swing.*;
public class p10 extends JFrame {
    public p10(){
        super("FlowLayout Demo");
        setLayout(new FlowLayout());
        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("Button4"));
        add(new JButton("Button5"));
        setSize(300,100);
        setVisible(true);
    }
    public static void main(String args[]){
        p10 app = new p10();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
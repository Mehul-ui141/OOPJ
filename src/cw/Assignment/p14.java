package cw.Assignment;
import java.awt.*;
import javax.swing.*;
public class p14 extends JFrame {
    public p14(){
        super("TextArea Demo");
        JTextArea area = new JTextArea(10,30);
        add(new JScrollPane(area));
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String args[]){
        p14 app = new p14();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
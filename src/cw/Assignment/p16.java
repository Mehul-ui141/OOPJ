package cw.Assignment;
import java.awt.*;
import javax.swing.*;
class DrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(20,20,100,60);
        g.setColor(Color.BLUE);
        g.fillOval(150,20,100,60);
    }
}
public class p16 extends JFrame {
    public p16(){
        super("Drawing Panel Test");
        add(new DrawPanel());
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String args[]){
        p16 app = new p16();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

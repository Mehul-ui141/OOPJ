package cw.Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class p9 extends JFrame {
    private int x,y;
    public p9(){
        super("p9");
        addMouseMotionListener(
                new MouseMotionAdapter(){
                    public void mouseDragged(MouseEvent event){
                        x=event.getX();
                        y=event.getY();
                        repaint();
                    }
                }
        );
        setSize(300,150);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x,y,4,4);
    }
    public static void main(String args[]){
        p9 app = new p9();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
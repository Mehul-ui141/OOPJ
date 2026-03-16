package cw.Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class p8 extends JFrame
        implements MouseListener, MouseMotionListener {
    private JLabel statusBar;
    public p8() {
        super("Demonstrating Mouse Events");
        statusBar = new JLabel();
        getContentPane().add(statusBar, BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(275,100);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent event){
        statusBar.setText("Clicked at ["+event.getX()+","+event.getY()+"]");
    }
    public void mousePressed(MouseEvent event){
        statusBar.setText("Pressed at ["+event.getX()+","+event.getY()+"]");
    }
    public void mouseReleased(MouseEvent event){
        statusBar.setText("Released at ["+event.getX()+","+event.getY()+"]");
    }
    public void mouseEntered(MouseEvent event){
        statusBar.setText("Mouse entered");
    }
    public void mouseExited(MouseEvent event){
        statusBar.setText("Mouse outside window");
    }
    public void mouseDragged(MouseEvent event){
        statusBar.setText("Dragged at ["+event.getX()+","+event.getY()+"]");
    }
    public void mouseMoved(MouseEvent event){
        statusBar.setText("Moved at ["+event.getX()+","+event.getY()+"]");
    }
    public static void main(String args[]){
        p8 application = new p8();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

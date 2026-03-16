package cw.Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class p15 extends JFrame implements KeyListener {
    private JLabel label;
    public p15(){
        super("Key Event Demo");
        label = new JLabel("Press any key");
        add(label);
        addKeyListener(this);
        setSize(300,100);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e){
        label.setText("Key Pressed: "+e.getKeyChar());
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public static void main(String args[]){
        p15 app = new p15();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
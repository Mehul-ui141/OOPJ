package cw.Assignment;
import java.awt.*;
import javax.swing.*;
public class p13 extends JFrame {
    public p13(){
        super("Panel Demo");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        panel.add(new JButton("Yes"));
        panel.add(new JButton("No"));
        panel.add(new JButton("Cancel"));
        add(panel,BorderLayout.SOUTH);
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String args[]){
        p13 app = new p13();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

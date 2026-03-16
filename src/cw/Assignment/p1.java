package cw.Assignment;
import java.awt.*;
import javax.swing.*;
public class p1 extends JFrame {
    private JLabel label1, label2, label3;
    public p1() {
        super("Testing JLabel");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label1 = new JLabel("Label with text");
        label1.setToolTipText("this is label1");
        container.add(label1);
        Icon bug = new ImageIcon("bug1.gif");
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("this is label2");
        container.add(label2);
        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        container.add(label3);
        setSize(275, 170);
        setVisible(true);
    }
    public static void main(String args[]) {
        p1 app = new p1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
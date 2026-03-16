package cw.Assignment;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class p3 extends JFrame {
    private JButton plainButton, fancyButton;
    public p3() {
        super("Testing Buttons");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        plainButton = new JButton("Plain Button");
        container.add(plainButton);
        Icon bug1 = new ImageIcon("bug1.gif");
        Icon bug2 = new ImageIcon("bug2.gif");
        fancyButton = new JButton("Fancy Button", bug1);
        fancyButton.setRolloverIcon(bug2);
        container.add(fancyButton);
        ButtonHandler handler = new ButtonHandler();
        fancyButton.addActionListener(handler);
        plainButton.addActionListener(handler);
        setSize(275, 100);
        setVisible(true);
    }
    public static void main(String args[]) {
        p3 application = new p3();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(
                    p3.this,
                    "You pressed: " + event.getActionCommand());
        }
    }
}
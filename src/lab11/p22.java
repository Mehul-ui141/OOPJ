//Design a Swing application that creates a real-time chat
//interface between two windows.
package lab11;
import javax.swing.*;
public class p22 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("User 1");
        JFrame f2 = new JFrame("User 2");
        JTextArea a1 = new JTextArea();
        JTextArea a2 = new JTextArea();
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b1 = new JButton("Send");
        JButton b2 = new JButton("Send");
        a1.setBounds(20,20,250,100);
        t1.setBounds(20,130,180,30);
        b1.setBounds(210,130,60,30);
        a2.setBounds(20,20,250,100);
        t2.setBounds(20,130,180,30);
        b2.setBounds(210,130,60,30);
        f1.add(a1); f1.add(t1); f1.add(b1);
        f2.add(a2); f2.add(t2); f2.add(b2);
        b1.addActionListener(e -> {
            a2.append("User1: "+t1.getText()+"\n");
            t1.setText("");
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        });
        b2.addActionListener(e -> {
            a1.append("User2: "+t2.getText()+"\n");
            t2.setText("");
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        });
        f1.setSize(300,220); f2.setSize(300,220);
        f1.setLayout(null); f2.setLayout(null);
        f1.setVisible(true); f2.setVisible(true);
    }
}
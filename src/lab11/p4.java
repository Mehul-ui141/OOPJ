//Write a Swing application that accepts two numbers from text
//fields and performs arithmetic operations using buttons.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField res = new JTextField();

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(200, 50, 100, 30);
        res.setBounds(100, 100, 150, 30);

        add.setBounds(50, 150, 50, 30);
        sub.setBounds(110, 150, 50, 30);
        mul.setBounds(170, 150, 50, 30);
        div.setBounds(230, 150, 50, 30);

        f.add(t1); f.add(t2); f.add(res);
        f.add(add); f.add(sub); f.add(mul); f.add(div);

        add.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            res.setText(String.valueOf(a + b));
        });

        sub.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            res.setText(String.valueOf(a - b));
        });

        mul.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            res.setText(String.valueOf(a * b));
        });

        div.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            res.setText(String.valueOf(a / b));
        });

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

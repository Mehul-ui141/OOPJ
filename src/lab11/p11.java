//Create a Swing program that implements a simple calculator
//supporting +, −, ×, ÷ operations.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p11 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField res = new JTextField();

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        t1.setBounds(50, 40, 100, 30);
        t2.setBounds(200, 40, 100, 30);
        res.setBounds(100, 90, 150, 30);

        add.setBounds(50, 140, 50, 30);
        sub.setBounds(110, 140, 50, 30);
        mul.setBounds(170, 140, 50, 30);
        div.setBounds(230, 140, 50, 30);

        f.add(t1); f.add(t2); f.add(res);
        f.add(add); f.add(sub); f.add(mul); f.add(div);

        add.addActionListener(e -> calc(t1, t2, res, '+'));
        sub.addActionListener(e -> calc(t1, t2, res, '-'));
        mul.addActionListener(e -> calc(t1, t2, res, '*'));
        div.addActionListener(e -> calc(t1, t2, res, '/'));

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static void calc(JTextField t1, JTextField t2, JTextField res, char op) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int r = 0;

        if(op=='+') r = a + b;
        if(op=='-') r = a - b;
        if(op=='*') r = a * b;
        if(op=='/') r = a / b;

        res.setText(String.valueOf(r));

        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
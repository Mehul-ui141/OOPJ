//Write a Java Swing program that creates a login form with
//username and password fields and validates the input when the
//login button is clicked.
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");
        JLabel l1 = new JLabel("Username:");
        JLabel l2 = new JLabel("Password:");
        JTextField t1 = new JTextField();
        JPasswordField t2 = new JPasswordField();
        JButton b = new JButton("Login");
        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 150, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 150, 30);
        b.setBounds(120, 150, 100, 30);
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = t1.getText();
                String pass = new String(t2.getPassword());
                if(user.equals("admin") && pass.equals("1234")) {
                    JOptionPane.showMessageDialog(f, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Credentials");
                }
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
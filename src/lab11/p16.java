//Create a Swing program that validates a student registration
//form (name, email, age).
package lab11;
import javax.swing.*;
import java.awt.event.*;
public class p16 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Form");
        JTextField name = new JTextField();
        JTextField email = new JTextField();
        JTextField age = new JTextField();
        JButton b = new JButton("Submit");
        name.setBounds(50,30,200,30);
        email.setBounds(50,70,200,30);
        age.setBounds(50,110,200,30);
        b.setBounds(80,150,100,30);
        f.add(name); f.add(email); f.add(age); f.add(b);
        b.addActionListener(e -> {
            if(name.getText().isEmpty() || email.getText().isEmpty() || age.getText().isEmpty())
                JOptionPane.showMessageDialog(f,"Fill all fields");
            else
                JOptionPane.showMessageDialog(f,"Valid");
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        });
        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}

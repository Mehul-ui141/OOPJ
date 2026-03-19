//Design a Swing application that generates a random number
//and asks the user to guess it.
package lab11;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
public class p12 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Guess Game");
        JLabel l = new JLabel("Guess (1-100):");
        JTextField t = new JTextField();
        JButton b = new JButton("Check");
        l.setBounds(50, 50, 120, 30);
        t.setBounds(170, 50, 100, 30);
        b.setBounds(120, 100, 100, 30);
        f.add(l); f.add(t); f.add(b);
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(t.getText());
                if(guess == num)
                    JOptionPane.showMessageDialog(f, "Correct!");
                else if(guess < num)
                    JOptionPane.showMessageDialog(f, "Too Low!");
                else
                    JOptionPane.showMessageDialog(f, "Too High!");
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

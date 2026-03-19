//Design a GUI that stores user input in a table (JTable) and
//displays it dynamically.
package lab11;
import javax.swing.*;
import javax.swing.table.*;
public class p17 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table");
        DefaultTableModel m = new DefaultTableModel(new String[]{"Name","Age"},0);
        JTable t = new JTable(m);
        JTextField name = new JTextField();
        JTextField age = new JTextField();
        JButton b = new JButton("Add");
        name.setBounds(20,20,100,30);
        age.setBounds(130,20,100,30);
        b.setBounds(240,20,80,30);
        JScrollPane sp = new JScrollPane(t);
        sp.setBounds(20,70,300,150);
        f.add(name); f.add(age); f.add(b); f.add(sp);
        b.addActionListener(e -> {
            m.addRow(new Object[]{name.getText(), age.getText()});
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        });
        f.setSize(350,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

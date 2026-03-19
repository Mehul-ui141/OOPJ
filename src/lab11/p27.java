//Create a GUI-based file explorer that lists files and folders
//from a directory.
package lab11;
import javax.swing.*;
import java.io.*;
public class p27 {
    public static void main(String[] args) {
        JFrame f = new JFrame("File Explorer");
        DefaultListModel<String> m = new DefaultListModel<>();
        JList<String> list = new JList<>(m);
        JScrollPane sp = new JScrollPane(list);
        JButton b = new JButton("Open Folder");
        b.setBounds(80,20,150,30);
        sp.setBounds(20,70,250,150);
        f.add(b); f.add(sp);
        b.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if(fc.showOpenDialog(f)==JFileChooser.APPROVE_OPTION) {
                File dir = fc.getSelectedFile();
                m.clear();
                for (File file : dir.listFiles()) {
                    m.addElement(file.getName());
                }
            }
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        });
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
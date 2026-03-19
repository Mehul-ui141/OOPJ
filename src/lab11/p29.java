//Write a Swing program that creates a multi-tab text editor using
//JTabbedPane.
package lab11;
import javax.swing.*;

public class p29 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Editor");

        JTabbedPane tp = new JTabbedPane();

        JTextArea t1 = new JTextArea();
        JTextArea t2 = new JTextArea();

        tp.add("Tab1", new JScrollPane(t1));
        tp.add("Tab2", new JScrollPane(t2));

        f.add(tp);

        f.setSize(400,300);
        f.setVisible(true);

        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
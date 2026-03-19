//Design a Swing application that generates a small dashboard
//displaying student statistics using charts and tables.
package lab11;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class p30 extends JPanel {
    int marks[] = {70,85,60};
    public void paint(Graphics g){
        super.paint(g);
        for(int i=0;i<marks.length;i++){
            g.fillRect(50+i*50,200-marks[i],30,marks[i]);
        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Dashboard");
        String col[]={"Name","Marks"};
        String data[][]={
                {"A","70"},{"B","85"},{"C","60"}
        };
        JTable t = new JTable(data,col);
        JScrollPane sp = new JScrollPane(t);
        p30 p = new p30();
        sp.setBounds(20,20,200,100);
        p.setBounds(20,130,250,150);
        f.add(sp); f.add(p);
        f.setSize(300,350);
        f.setLayout(null);
        f.setVisible(true);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
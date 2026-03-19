//Write a program that displays system resource information
//(CPU, memory) in graphical form.
package lab11;
import javax.swing.*;
import java.awt.*;
import java.lang.management.*;
public class p26 extends JPanel {
    int mem=0;
    public void paint(Graphics g){
        super.paint(g);
        g.fillRect(50,200-mem,50,mem);
        g.drawString("Memory",50,220);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("System Info");
        p26 p = new p26();
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
        new Timer(1000,e->{
            MemoryMXBean m = ManagementFactory.getMemoryMXBean();
            long used = m.getHeapMemoryUsage().getUsed()/1000000;
            p.mem = (int)used;
            p.repaint();
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        }).start();
    }
}

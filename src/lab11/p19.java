//Design a GUI that draws simple shapes (circle, rectangle, line)
//when selected from a menu.
package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class p19 extends JPanel {
    String shape="";
    public void paint(Graphics g){
        super.paint(g);
        if(shape.equals("c")) g.drawOval(50,50,100,100);
        if(shape.equals("r")) g.drawRect(50,50,100,100);
        if(shape.equals("l")) g.drawLine(50,50,150,150);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Shapes");
        p19 p = new p19();
        JButton c = new JButton("Circle");
        JButton r = new JButton("Rect");
        JButton l = new JButton("Line");
        f.add(c); f.add(r); f.add(l); f.add(p);
        c.setBounds(20,10,80,30);
        r.setBounds(110,10,80,30);
        l.setBounds(200,10,80,30);
        p.setBounds(20,50,300,200);
        c.addActionListener(e->{p.shape="c"; p.repaint();});
        r.addActionListener(e->{p.shape="r"; p.repaint();});
        l.addActionListener(e->{p.shape="l"; p.repaint();});
        f.setSize(350,300);
        f.setLayout(null);
        f.setVisible(true);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

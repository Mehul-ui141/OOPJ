//Develop a Swing application that draws freehand sketches
//using mouse drag events.
package lab11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class p25 extends JPanel {
    int x1,y1,x2,y2;
    public p25(){
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                x2=e.getX(); y2=e.getY();
                getGraphics().drawLine(x1,y1,x2,y2);
                x1=x2; y1=y2;
                System.out.println("Mehul Jha");
                System.out.println("2405287");
            }
        });
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                x1=e.getX(); y1=e.getY();
            }
        });
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Draw");
        p25 p = new p25();
        f.add(p);
        f.setSize(400,300);
        f.setVisible(true);
    }
}

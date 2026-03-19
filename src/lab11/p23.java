//Write a program that visualizes sorting algorithms using
//animated bars.
package lab11;
import javax.swing.*;
import java.awt.*;
public class p23 extends JPanel {
    int arr[] = {50,20,80,30,60};
    public void paint(Graphics g){
        super.paint(g);
        for(int i=0;i<arr.length;i++){
            g.fillRect(50+i*40,200-arr[i],30,arr[i]);
        }
    }
    void sort(){
        new Thread(() -> {
            try{
                for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr.length-1;j++){
                        if(arr[j]>arr[j+1]){
                            int t=arr[j]; arr[j]=arr[j+1]; arr[j+1]=t;
                            repaint();
                            Thread.sleep(300);
                        }
                    }
                }
            }catch(Exception e){}
        }).start();
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Sort");
        p23 p = new p23();
        JButton b = new JButton("Sort");
        b.setBounds(100,20,100,30);
        f.add(p); f.add(b);
        p.setBounds(0,60,300,200);
        b.addActionListener(e -> p.sort());
        f.setSize(350,300);
        f.setLayout(null);
        f.setVisible(true);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

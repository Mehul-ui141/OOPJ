//Develop a multi-threaded Swing program where a progress bar
//updates while a background task runs.
package lab11;
import javax.swing.*;

public class p21 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Progress");

        JProgressBar pb = new JProgressBar(0,100);
        pb.setBounds(50,50,200,30);

        JButton b = new JButton("Start");
        b.setBounds(100,100,100,30);

        f.add(pb); f.add(b);

        b.addActionListener(e -> {
            new Thread(() -> {
                for(int i=0;i<=100;i++){
                    pb.setValue(i);
                    try{ Thread.sleep(50); }catch(Exception ex){}

                    System.out.println("Mehul Jha");
                    System.out.println("2405287");
                }
            }).start();
        });

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}

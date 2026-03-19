//Create a GUI that simulates a simple digital clock with alarm
//functionality.
package lab11;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class p24 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Clock");
        JLabel l = new JLabel();
        JTextField alarm = new JTextField("HH:mm:ss");
        l.setBounds(100,50,200,30);
        alarm.setBounds(100,100,150,30);
        f.add(l); f.add(alarm);
        new Timer(1000, e -> {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            l.setText(time);
            if(time.equals(alarm.getText()))
                JOptionPane.showMessageDialog(f,"Alarm!");
            System.out.println("Mehul Jha");
            System.out.println("2405287");
        }).start();
        f.setSize(350,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
//Write a program to read and display all characters from a file using
//FileInputStream until end-of-file (-1).
package lab9;
import java.io.FileInputStream;
public class p9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream f = new FileInputStream("C:\\OOPJ\\data3.txt");
        int ch = f.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = f.read();
        }
        f.close();
    }
}

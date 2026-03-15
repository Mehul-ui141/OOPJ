//Write a Java program to read the first character from a file using
//FileInputStream and display it.
package lab9;
import java.io.FileInputStream;
public class p8{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream f = new FileInputStream("C:\\OOPJ\\data3.txt");
        int ch = f.read();
        f.close();
        System.out.println("First character: " + (char) ch);
    }
}
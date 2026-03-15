//Write a Java program to copy contents of one file into another using
//FileInputStream and FileOutputStream.
package lab9;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class p12{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream in = new FileInputStream("C:\\OOPJ\\data3.txt");
        FileOutputStream out = new FileOutputStream("C:\\OOPJ\\copy.txt");
        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);
        }
        in.close();
        out.close();
        System.out.println("File copied");
    }
}
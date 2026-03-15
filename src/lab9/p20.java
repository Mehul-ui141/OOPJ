//Write a Java program to demonstrate difference between InputStream and
//OutputStream using practical file operations.
package lab9;
import java.io.*;
public class p20{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            FileOutputStream fout = new FileOutputStream("C:\\OOPJ\\data4.txt");
            String s = "Java File Handling Example";
            fout.write(s.getBytes());
            System.out.println("OutputStream usage.");
            FileInputStream fin = new FileInputStream("C:\\OOPJ\\data4.txt");
            System.out.println("InputStream usage:");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fout.close();
            fin.close();
        }
        catch (Exception e) {
            System.out.println("Exception caught.");
        }
    }
}
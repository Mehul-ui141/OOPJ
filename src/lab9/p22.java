//Write a Java program to read file data and display both byte value and
//corresponding character for each byte.
package lab9;
import java.io.*;
public class p22 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream f = new FileInputStream("C:\\OOPJ\\data3.txt");
        int b;
        while ((b = f.read()) != -1) {
            System.out.println(b + " -> " + (char)b);
        }
        f.close();
    }
}
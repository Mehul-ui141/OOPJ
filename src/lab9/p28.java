//Write a Java program to demonstrate buffering concept by reading file data
//byte-by-byte and printing performance difference.
package lab9;
import java.io.*;
public class p28 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        long t1 = System.currentTimeMillis();
        FileInputStream f1 = new FileInputStream("C:\\OOPJ\\data3.txt");
        while (f1.read() != -1) {}
        f1.close();
        long t2 = System.currentTimeMillis();

        long t3 = System.currentTimeMillis();
        BufferedInputStream f2 = new BufferedInputStream(new FileInputStream("C:\\OOPJ\\data3.txt"));
        while (f2.read() != -1) {}
        f2.close();
        long t4 = System.currentTimeMillis();
        System.out.println("Without buffer: " + (t2 - t1) + " ms");
        System.out.println("With buffer: " + (t4 - t3) + " ms");
    }
}
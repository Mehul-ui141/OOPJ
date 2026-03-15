//Write a Java program to compare contents of two files and display whether
//they are identical or not.
package lab9;
import java.io.FileInputStream;
public class p14{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream f1 = new FileInputStream("C:\\OOPJ\\data3.txt");
        FileInputStream f2 = new FileInputStream("C:\\OOPJ\\copy.txt");
        int b1, b2;
        boolean same = true;
        while (true) {
            b1 = f1.read();
            b2 = f2.read();

            if (b1 != b2) {
                same = false;
                break;
            }
            if (b1 == -1) break;  
        }
        f1.close();
        f2.close();
        if (same)
            System.out.println("Files are identical");
        else
            System.out.println("Files are different");
    }
}
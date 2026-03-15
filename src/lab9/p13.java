//Write a program to merge contents of two files into a third file.
package lab9;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class p13{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream f1 = new FileInputStream("C:\\OOPJ\\data3.txt");
        FileInputStream f2 = new FileInputStream("C:\\OOPJ\\data2.txt");
        FileOutputStream f3 = new FileOutputStream("C:\\OOPJ\\copy.txt");
        int ch;
        while ((ch = f1.read()) != -1)
            f3.write(ch);
        while ((ch = f2.read()) != -1)
            f3.write(ch);
        f1.close();
        f2.close();
        f3.close();
        System.out.println("Files merged");
    }
}
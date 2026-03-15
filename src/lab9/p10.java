//Write a Java program to count total characters present in a file using
//FileInputStream.
package lab9;
import java.io.FileInputStream;
public class p10{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream f = new FileInputStream("C:\\OOPJ\\data3.txt");
        int ch, count = 0;
        while ((ch = f.read()) != -1) {
            count++;
        }
        f.close();
        System.out.println("Total characters: " + count);
    }
}

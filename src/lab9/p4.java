//Write a Java program to write a single byte value into a file using
//FileOutputStream and verify the stored character.
package lab9;
import java.io.FileOutputStream;
public class p4{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileOutputStream fout = new FileOutputStream("C:\\OOPJ\\data.txt");
        fout.write('M');
        fout.close();
    }
}
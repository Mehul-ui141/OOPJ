//Write a Java program to decrypt the previously encrypted file and restore
//original content.
package lab9;
import java.io.*;
public class p30 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream in = new FileInputStream("C:\\OOPJ\\enc.txt");
        FileOutputStream out = new FileOutputStream("C:\\OOPJ\\denc.txt");
        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch - 1);
        }
        in.close();
        out.close();
        System.out.println("File decrypted");
    }
}
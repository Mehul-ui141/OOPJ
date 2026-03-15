//Write a program to encrypt file content by shifting each character by +1
//ASCII value and store in another file.
package lab9;
import java.io.*;
public class p29 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream in = new FileInputStream("C:\\OOPJ\\stud.txt");
        FileOutputStream out = new FileOutputStream("C:\\OOPJ\\enc.txt");
        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch + 1);
        }
        in.close();
        out.close();
        System.out.println("File encrypted");
    }
}
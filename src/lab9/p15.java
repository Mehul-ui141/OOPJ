//Write a program to convert all lowercase characters in a file to uppercase
//and save into another file.
package lab9;
import java.io.*;
public class p15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream in = new FileInputStream("C:\\OOPJ\\data3.txt");
        FileOutputStream out = new FileOutputStream("C:\\OOPJ\\upper.txt");
        int ch;
        while ((ch = in.read()) != -1) {
            char c = (char) ch;
            if (c >= 'a' && c <= 'z')
                c = (char)(c - 32);
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("Converted to uppercase");
    }
}

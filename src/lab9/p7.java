//Write a program to write multiple lines into a file using FileOutputStream
//and proper newline characters.
package lab9;
import java.io.FileOutputStream;
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        FileOutputStream f = new FileOutputStream("C:\\OOPJ\\data3.txt");
        System.out.println("Enter 3 lines:");
        for (int i = 0; i < 3; i++) {
            String s = sc.nextLine();
            f.write((s + "\n").getBytes());
        }
        f.close();
        System.out.println("Lines written to file");
    }
}
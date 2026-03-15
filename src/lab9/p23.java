//Write a program to create a menu-driven file management system allowing
//write, read, append, and exit operations.
package lab9;
import java.io.*;
import java.util.*;
public class p23 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n1.Write 2.Read 3.Append 4.Exit");
            ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                FileOutputStream f = new FileOutputStream("C:\\OOPJ\\menu.txt");
                System.out.print("Enter text: ");
                String s = sc.nextLine();
                f.write(s.getBytes());
                f.close();
            }
            else if (ch == 2) {
                FileInputStream f = new FileInputStream("C:\\OOPJ\\menu.txt");
                int b;
                while ((b = f.read()) != -1)
                    System.out.print((char)b);
                f.close();
                System.out.println();
            }
            else if (ch == 3) {
                FileOutputStream f = new FileOutputStream("C:\\OOPJ\\menu.txt", true);
                System.out.print("Enter text: ");
                String s = sc.nextLine();
                f.write(s.getBytes());
                f.close();
            }
        }
        while (ch != 4);
    }
}
//Write a program to write a user-entered string into a file by converting it
//into a byte array using getBytes().
package lab9;
import java.io.FileOutputStream;
import java.util.Scanner;
public class p5{
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String s = sc.nextLine();
        FileOutputStream f = new FileOutputStream("C:\\OOPJ\\data2.txt");
        f.write(s.getBytes());
        f.close();
        System.out.println("Written");
    }
}
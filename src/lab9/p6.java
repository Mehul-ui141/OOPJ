//6. Write a Java program to append text to an existing file using
//FileOutputStream in append mode.
package lab9;
import java.io.FileOutputStream;
import java.util.Scanner;
public class p6 {
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String s = sc.nextLine();
        FileOutputStream f = new FileOutputStream("C:\\OOPJ\\data2.txt",true);
        f.write(s.getBytes());
        f.close();
        System.out.println("Written");
    }
}

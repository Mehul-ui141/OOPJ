//Write a Java program that accepts a filename from user and checks
//whether the file exists, is readable, and writable.
package lab9;
import java.io.*;
import java.util.*;
public class p18{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String name = sc.nextLine();
        File f = new File(name);
        System.out.println("Exists: " + f.exists());
        System.out.println("Readable: " + f.canRead());
        System.out.println("Writable: " + f.canWrite());
    }
}
//Write a Java program to delete a file after checking its existence and
//displaying appropriate message.
package lab9;
import java.io.*;
public class p26 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        File f = new File("C:\\OOPJ\\upper.txt");
        if (f.exists()) {
            if (f.delete())
                System.out.println("File deleted");
            else
                System.out.println("Cannot delete file");
        } else {
            System.out.println("File does not exist");
        }
    }
}
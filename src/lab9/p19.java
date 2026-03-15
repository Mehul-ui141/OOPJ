//Write a program to handle FileNotFoundException while attempting to
//open a non-existing file.
package lab9;
import java.io.*;
public class p19 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            FileInputStream f = new FileInputStream("C:\\OOPJ\\quiz.txt");
            f.close();
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
        }
    }
}
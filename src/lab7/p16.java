//Write a program that uses throws to declare a checked exception in a method.
package lab7;
import java.io.*;
public class p16 {
    static void readFile() throws IOException {
        FileReader f = new FileReader("data.txt");
        System.out.println("File opened");
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        readFile();
    }
}

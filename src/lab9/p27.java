//Write a program to create a file and write current date and time into it
//using PrintWriter.
package lab9;
import java.io.*;
import java.util.*;
public class p27 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        PrintWriter pw = new PrintWriter("C:\\OOPJ\\datetime.txt");
        pw.println(new Date());
        pw.close();
        System.out.println("Date and time written");
    }
}
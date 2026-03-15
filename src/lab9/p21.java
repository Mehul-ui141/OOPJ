//Write a program to write formatted student details into a file using
//PrintWriter class.
package lab9;
import java.io.*;
public class p21 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        PrintWriter pw = new PrintWriter("C:\\OOPJ\\stud.txt");
        pw.println("Name: Rahul");
        pw.println("Roll: 101");
        pw.println("Course: B.Tech");
        pw.println("Marks: 85");
        pw.close();
        System.out.println("Student details written");
    }
}
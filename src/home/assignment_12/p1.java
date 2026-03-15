package home.assignment_12;
import java.util.Scanner;
import java.io.*;

public class p1 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\OOPJ\\readnum.txt");
            Scanner sc = new Scanner(file);

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("The numbers read from file are: " + num1 + " " + num2);
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("Mehul Jha\n2405282");
    }
}
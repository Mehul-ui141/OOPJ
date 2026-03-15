//Write a Java program to store 10 integers entered by the user into a file and
//then read them back to compute sum and average.
package lab9;
import java.io.*;
import java.util.*;
public class p24 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("C:\\OOPJ\\num.txt");
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                fw.write(num + " ");
            }
            fw.close();
            FileReader fr = new FileReader("C:\\OOPJ\\num.txt");
            Scanner sc2 = new Scanner(fr);
            int sum = 0, count = 0;
            while (sc2.hasNextInt()) {
                int n = sc2.nextInt();
                sum += n;
                count++;
            }
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (sum / (double) count));
            fr.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
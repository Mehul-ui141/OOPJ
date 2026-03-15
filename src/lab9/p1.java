//Write a Java program to demonstrate System.out, System.err, and System.in
//streams with appropriate console interaction.
package lab9;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n < 0)
            System.err.println("Negative number");
        else
            System.out.println("You entered " + n);
    }
}
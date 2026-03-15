//Write a Java program to check whether one string is rotation of another
//using only one string operation.
package lab8;
import java.util.Scanner;
public class p17 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if(s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("It is a rotation.");
        }
        else {
            System.out.println("Not a rotation.");
        }
    }
}

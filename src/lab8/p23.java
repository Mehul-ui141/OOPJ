//Write a Java program to determine whether two strings differ by exactly
//one character.
package lab8;
import java.util.Scanner;
public class p23 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if(s1.length() != s2.length()) {
            System.out.println("Strings do NOT differ by exactly one character.");
        }
        else {
            int diff = 0;
            for(int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i))
                    diff++;
            }
            if(diff == 1)
                System.out.println("Strings differ by exactly one character.");
            else
                System.out.println("Strings do NOT differ by exactly one character.");
        }
    }
}

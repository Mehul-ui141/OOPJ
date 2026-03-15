//Write a Java program to detect whether a string is a valid palindrome
//considering only alphanumeric characters.
package lab8;
import java.util.Scanner;
public class p27 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.nextLine().toLowerCase();
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
                t = t + c;
        }
        String r = "";
        for (int i = t.length() - 1; i >= 0; i--)
            r += t.charAt(i);
        if (t.equals(r))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
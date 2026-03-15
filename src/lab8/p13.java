//Write a Java program to toggle the case of characters without using built-
//in case conversion methods.
package lab8;
import java.util.Scanner;
public class p13{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ' || (t.length() > 0 && t.charAt(t.length()-1) != ' '))
                t += c;
        }
        System.out.println("Result: " + t);
    }
}

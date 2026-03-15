//Write a Java program to toggle the case of characters without using built-
//in case conversion methods.
package lab8;
import java.util.Scanner;
public class p12 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        char[] a = sc.nextLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'a' && a[i] <= 'z')
                a[i] = (char)(a[i] - 32);
            else if (a[i] >= 'A' && a[i] <= 'Z')
                a[i] = (char)(a[i] + 32);
        }
        System.out.println("Toggled: " + new String(a));
    }
}
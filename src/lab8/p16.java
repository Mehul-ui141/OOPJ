//Write a Java program to validate a password based on length, uppercase,
//lowercase, digit, and special character rules.
package lab8;
import java.util.Scanner;
public class p16 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String p = sc.nextLine();
        boolean upper = false, lower = false, dgt = false, sp = false;
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c >= 'A' && c <= 'Z')
                upper = true;
            else if (c >= 'a' && c <= 'z')
                lower = true;
            else if (c >= '0' && c <= '9')
                dgt = true;
            else
                sp = true;
        }
        if (p.length() >= 5 && upper && lower && dgt && sp)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
//Write a Java program to determine whether a string is a valid IPv4 address.
package lab8;
import java.util.Scanner;
public class p21 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP: ");
        String ip = sc.nextLine();
        String[] p = ip.split("\\.");
        boolean ok = true;
        if (p.length != 4) ok = false;
        for (int i = 0; i < p.length && ok; i++) {
            if (p[i].length() == 0) ok = false;
            else {
                int num = Integer.parseInt(p[i]);
                if (num < 0 || num > 255) ok = false;
            }
        }
        if (ok)
            System.out.println("Valid IPv4");
        else
            System.out.println("Invalid IPv4");
    }
}
//Write a Java program to print all possible substrings of a given string and
//count them.
package lab8;
import java.util.Scanner;
public class p18 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                count++;
            }
        }
        System.out.println("Total substrings: " + count);
    }
}

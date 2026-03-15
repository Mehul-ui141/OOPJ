//Write a Java program to generate all permutations of a given string.
package lab8;
import java.util.Scanner;
public class p24{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Permutations are:");
        permute(str, "");
        sc.close();
    }
    static void permute(String str, String result) {
        if(str.length() == 0) {
            System.out.println(result);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + ch);
        }
    }
}
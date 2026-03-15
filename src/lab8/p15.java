package lab8;
import java.util.Scanner;
public class p15{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String res = "";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
                count++;
            else {
                res = res + s.charAt(i) + count;
                count = 1;
            }
        }
        System.out.println("After Compression: " + res);
    }
}

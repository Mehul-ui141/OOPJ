package lab8;
import java.util.Scanner;
public class p29{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String longest = "";
        for(int i = 0; i < str.length(); i++) {
            String p1 = expand(str, i, i);
            String p2 = expand(str, i, i + 1);
            if(p1.length() > longest.length())
                longest = p1;
            if(p2.length() > longest.length())
                longest = p2;
        }
        System.out.println("Longest Palindromic Substring: " + longest);
    }
    static String expand(String s, int left, int right) {
        while(left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

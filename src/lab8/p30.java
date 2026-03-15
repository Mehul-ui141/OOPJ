package lab8;
import java.util.Scanner;
public class p30 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int ch;
        do {
            System.out.println("1.Reverse  2.Palindrome  3.Vowels  4.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("Reverse: " + reverse(str));
                    break;
                case 2:
                    if(str.equals(reverse(str)))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;
                case 3:
                    System.out.println("Vowels: " + countVowel(str));
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while(ch != 4);
    }
    static String reverse(String s) {
        String r = "";
        for(int i = s.length()-1; i >= 0; i--)
            r += s.charAt(i);
        return r;
    }
    static int countVowel(String s) {
        int c = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++)
            if("aeiou".indexOf(s.charAt(i)) != -1)
                c++;
        return c;
    }
}

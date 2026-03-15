//Write a Java program to check whether a string follows a given pattern
//(e.g., &quot;abba&quot; matches &quot;dog cat cat dog&quot;).
package lab8;
import java.util.Scanner;
public class p25 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern: ");
        String p = sc.nextLine();
        System.out.print("Enter sentence: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        if(p.length() != words.length) {
            System.out.println("Not Matched");
            return;
        }
        boolean matched = true;
        for(int i = 0; i < p.length(); i++) {
            for(int j = i + 1; j < p.length(); j++) {
                if(p.charAt(i) == p.charAt(j) &&
                        !words[i].equals(words[j])) {
                    matched = false;
                }
                if(p.charAt(i) != p.charAt(j) &&
                        words[i].equals(words[j])) {
                    matched = false;
                }
            }
        }
        if(matched)
            System.out.println("Matched");
        else
            System.out.println("Not Matched");
    }
}

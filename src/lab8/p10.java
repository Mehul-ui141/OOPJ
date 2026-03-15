//Write a Java program to find the first non-repeating character in a string.
package lab8;
public class p10{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s="Hacker";
        char result = ' ';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j))
                    count++;
                }
                if (count == 1) {
                    result = ch;
                    break;
                }
        }
        System.out.println("First non-repeating = " + result);
    }
}
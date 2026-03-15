//Write a Java program to check whether a given string is a palindrome
//ignoring spaces and case sensitivity.
package lab8;
public class p5{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s = "Madam";
        s = s.replace(" ", "").toLowerCase();
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
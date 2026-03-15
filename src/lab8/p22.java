//Write a Java program to implement your own version of indexOf()
//method without using built-in functions.
package lab8;
import java.util.Scanner;
public class p22{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();
        int index = -1;
        for(int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            for(j = 0; j < sub.length(); j++) {
                if(str.charAt(i + j) != sub.charAt(j))
                    break;
            }
            if(j == sub.length()) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);
    }
}

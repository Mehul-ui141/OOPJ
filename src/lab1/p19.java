//19.Write a Java program to reverse a given integer
package lab1;
import java.util.Scanner;
public class p19 {
    public static void main() {
        int dg,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        while(n!= 0){
            dg=n%10;
            rev=rev*10+dg;
            n=n/10;
        }
        System.out.println("Reversed Number is:"+rev);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

//17.Write a Java program to calculate the factorial of a number using a loop.
package lab1;
import java.util.Scanner;
public class p17{
    public static void main(String[] args){
        int fact = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

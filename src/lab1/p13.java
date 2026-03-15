//13.Write a Java program to check whether a number is divisible by both 3 and 5.
package lab1;
import java.util.Scanner;
public class p13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        if(n%15==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

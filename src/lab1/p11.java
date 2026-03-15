//11.Write a Java program to check whether a number is even or odd.
package lab1;
import java.util.Scanner;
public class p11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

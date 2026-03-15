//12.Write a Java program to read two integers and print the larger number.
package lab1;
import java.util.Scanner;
public class p12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n=sc.nextInt();
        System.out.println("Enter Second Number:");
        int m=sc.nextInt();
        if(n>m){
            System.out.println(n);
        }
        else{
            System.out.println(m);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

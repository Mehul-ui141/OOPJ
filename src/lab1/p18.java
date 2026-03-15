//18.Write a Java program to print all numbers from 1 to N that are divisible by 7.
package lab1;
import java.util.Scanner;
public class p18{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n=sc.nextInt();
        System.out.println("Numbers from 1 to " +n+ " that are divisible by 7:");
        for(int i=1;i<=n;i++){
            if(i%7==0){
                System.out.println(i+" ");
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

//14.Write a Java program to calculate the simple interest.
package lab1;
import java.util.Scanner;
public class p14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal:");
        double p=sc.nextInt();
        System.out.println("Enter Rate:");
        double r=sc.nextInt();
        System.out.println("Enter Time:");
        double t=sc.nextInt();

        double SI=(p*r*t)/100;
        System.out.println("Simple Intrest is:"+SI);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

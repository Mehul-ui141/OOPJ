//8.Write a Java program to convert temperature from Celsius to Fahrenheit.
package lab1;
import java.util.Scanner;
public class p8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature:");
        double c=sc.nextInt();
        double f=(c*9)/5+32;
        System.out.println("Temperature is "+ f);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

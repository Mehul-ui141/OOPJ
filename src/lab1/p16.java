//16.Write a Java program to check whether a given year is a leap year or not.
package lab1;
import java.util.Scanner;
public class p16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int y=sc.nextInt();
        if(y%4==0 & y%100!=0|| y%400==0){
            System.out.println("Given year is a leap year");
        }
        else{
            System.out.println("Given year is not a leap year");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

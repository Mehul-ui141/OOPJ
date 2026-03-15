//20.Write a Java program to find the largest among
// three numbers using conditional statements
package lab1;
import java.util.Scanner;
public class p20{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int a=sc.nextInt();
        System.out.println("Enter Second number:");
        int b=sc.nextInt();
        System.out.println("Enter Third number:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

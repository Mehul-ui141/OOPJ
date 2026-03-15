//Write a program to handle InputMismatchException using the Scanner class.
package lab7;
import java.util.*;
public class p5{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
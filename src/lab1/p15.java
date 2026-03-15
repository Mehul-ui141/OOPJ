//15.Write a Java program that takes marks of 5 subjects
// and prints the total and percentage.
package lab1;
import java.util.Scanner;
public class p15{
    public static void main(String[] args){
        int totalMarks=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("Enter Marks of subject"+i+":");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
        double percentage= (totalMarks/500.0)*100;
        System.out.println("Total marks is"+totalMarks);
        System.out.println("Percentage is"+percentage);
        System.out.println("Mehul Jha");
        System.out.println("2405287");

    }
}

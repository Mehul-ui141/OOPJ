//5.Write a Java program to print the ASCII value of a character.
package lab1;
import java.util.Scanner;
public class p5{
    public static void main(String[] args){
        System.out.println("Enter Character:");
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        int ascii=(int) ch;
        System.out.println("ASCII value of '"+ ch +"'is:"+ascii);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

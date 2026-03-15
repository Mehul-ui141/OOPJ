//6.Write a Java program to take your name and age as input and print:
//Hello <name>, your age is <age>.
package lab1;
import java.util.Scanner;
public class p6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", your age is " + age + ".");
        System.out.println("Mehul Jha");
        System.out.println("2405287");
            }
}

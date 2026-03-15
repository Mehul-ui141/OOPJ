//Write a program to demonstrate execution of an instance initializer block.
package lab5;
public class p20 {
    {
        System.out.println("Instance initializer block executed.");
    }
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        p20 obj=new p20();
        System.out.println("Main method print statement.");
    }
}
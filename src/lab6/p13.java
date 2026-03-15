//Write a program to demonstrate functional interfaces and lambda expressions.
package lab6;
@FunctionalInterface
interface A7{
    int calculate(int a, int b);
}
public class p13{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A7 add = (a,b)->a+b;
        System.out.println("Add: " + add.calculate(88, 9));
    }
}
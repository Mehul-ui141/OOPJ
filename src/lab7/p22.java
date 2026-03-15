//Write a program to demonstrate exception propagation across multiple method calls.
package lab7;
class something22 {
    static void method3() {
        int a = 10 / 0;
    }
    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }
}
public class p22 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            something22.method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main");
        }
    }
}
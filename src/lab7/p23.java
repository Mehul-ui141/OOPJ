//Modify the above program to handle the exception at an intermediate method.
package lab7;
class something23 {
    static void method3() {
        int a = 10 / 0;
    }
    static void method2() {
        try {
            method3();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in method2");
        }
    }
    static void method1() {
        method2();
    }
}
public class p23 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        something23.method1();
    }
}
// Demonstrate polymorphism with method parameters and return types.
package lab5;
public class Calculator {
    static float area(float n) {
        return n * n;
    }

    static float area(float m, float n) {
        return m * n;
    }
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        System.out.println(Calculator.area(5));
        System.out.println(Calculator.area(50f, 0.3f));
    }
}
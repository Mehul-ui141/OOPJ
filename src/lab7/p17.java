//Write a program demonstrating the difference between throw and throws.
package lab7;
class something{
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero using throw");
        }
        System.out.println("Result: " + (a / b));
    }
}
public class p17 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            something.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
// 18. Write a program where a method throws multiple exceptions using throws.
package lab7;
class something18 {
    static void test(int a) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[a]);
        System.out.println(10 / a);
    }
}
public class p18 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try {
            something18.test(0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
        }
    }
}
// 24. Write a program where an exception is thrown in both try and finally blocks.
package lab7;
class something24 {
    static void demo() {
        try {
            int a = 10 / 0;
        } finally {
            int b = 10 / 0;
        }
    }
}
public class p24 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        something24.demo();
    }
}
//Write a Java program where a constructor counts the number of objects created.
package lab4;
class Counter {
    static int count = 0;
    Counter() {
        count++;
        System.out.println("Object created. Count = " + count);
    }
}
public class p6 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
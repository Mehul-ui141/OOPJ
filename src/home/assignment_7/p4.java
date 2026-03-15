package home.assignment_7;
class A3 {
    A3() {
        this(10);
        System.out.println("hello a");
    }
    A3(int x) {
        System.out.println(x);
    }
}
public class p4{
    public static void main(String args[]) {
        A3 a = new A3();
    }
}
package home.assignment_7;
public class p8{
    public static void main(String args[]) {
        new A4().getA4().msg();
    }
}
class A4 {
    A4 getA4() {
        return this;
    }
    void msg() {
        System.out.println("Hello java");
    }
}
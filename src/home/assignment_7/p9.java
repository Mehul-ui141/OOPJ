package home.assignment_7;
public class p9{
    public static void main(String args[]) {
        A5 obj = new A5();
        System.out.println(obj);
        obj.m();
    }
}
class A5 {
    void m() {
        System.out.println(this);
    }
}
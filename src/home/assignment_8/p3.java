package home.assignment_8;

public class p3{
    public static void main(String args[]) {
        new B1().get().message();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
class A {
    A get() {
        return this;
    }
}
class B1 extends A {
    B1 get() {
        return this;
    }
    void message(){
        System.out.println("welcome to covariant return type");
    }
}

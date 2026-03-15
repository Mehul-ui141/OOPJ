//Write a Java program where a child class calls a parameterized parent constructor
// using super().
package lab5;
class Parent {
    String m;
    Parent(String m) {
        this.m = m;
        System.out.println("Parent constructor called: " + m);
    }
}
class Child extends Parent {
    Child(String m) {
        super(m);
        System.out.println("Child constructor called");
    }
}
public class p1{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Child obj = new Child("Suman");
    }
}
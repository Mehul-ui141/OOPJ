//1. Write a Java program using an abstract class that contains:
//A. An abstract method
//B. A non-abstract method  Demonstrate method implementation in a subclass.
package lab6;
abstract class A{
    abstract void show();
    void display(){
        System.out.println("Non-abstract method");
    }
}
class B extends A{
    void show(){
        System.out.println("Abstract method");
    }
}
public class p1{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A obj=new B();
        obj.display();
        obj.show();
    }
}
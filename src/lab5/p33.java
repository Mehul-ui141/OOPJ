//Write a program where a parent reference invokes different child implementations.
package lab5;
public class p33{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A33 obj=new B33();
        obj.display();
        obj=new C33();
        obj.display();
    }
}
class A33{
    void display(){
        System.out.println("Display method in class A33");
    }
}
class B33 extends A33{
    void display(){
        System.out.println("Display method in class B33");
    }
}
class C33 extends A33{
    void display(){
        System.out.println("Display method in class C33");
    }
}
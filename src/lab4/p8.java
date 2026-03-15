// Write a program to show the difference between constructor and method using execution order.
package lab4;
public class p8{
    public static void main(String[] args) {
        C8 obj=new C8();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
class C8{
    C8(){
        System.out.println("Constructor called");
        display();
    }
    void display(){
        System.out.println("Method called");
    }
}
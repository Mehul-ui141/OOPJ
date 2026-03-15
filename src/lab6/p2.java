//2. Create an abstract class with a constructor and show how it is invoked
// during object creation.
package lab6;
abstract class A2{
    A2(){
        System.out.println("constructor called");
    }
}
class B2 extends A2{ }
public class p2{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        new B2();
    }
}
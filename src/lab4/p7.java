//Demonstrate constructor chaining using multiple constructors in the same class.
package lab4;
public class p7{
    public static void main(String[] args) {
        C7 obj1 = new C7();
        C7 obj2 = new C7(10);
        C7 obj3 = new C7(20, 30);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
class C7{
    C7(){
        System.out.println("Default constructor called");
    }
    C7(int x){
        this();
        System.out.println("Parameterized constructor called with value: " + x);
    }
    C7(int x, int y){
        this(x);
        System.out.println("Two-parameter constructor called with values: " + x + ", " + y);
    }
}
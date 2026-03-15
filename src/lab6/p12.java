//12. Create an interface with:
//A. Constants
//B. Abstract methods and show how they are accessed in implementing classes.
package lab6;
interface A6{
    int x=10;
    abstract void hello();
}
class B6 implements A6{
    public void hello(){
        System.out.println("Value is: " + x);
    }
}
public class p12{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A6 c=new B6();
        c.hello();
    }
}
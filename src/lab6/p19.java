//Show the difference between interface and abstract class using a program.
package lab6;
public class p19 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        C19 a = new C19();
        a.show();
        a.display();
    }
}
interface A19{
    void show();
}
abstract class B19 {
    void display() {
        System.out.println("Abstract class method");
    }
}
class C19 extends B19 implements A19 {
    public void show() {
        System.out.println("Interface method");
    }
}
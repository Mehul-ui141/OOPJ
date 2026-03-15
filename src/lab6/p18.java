//Write a program where an interface extends another interface and a class implements the
// child interface.
package lab6;
public class p18 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A18 f = new A18();
        f.show();
    }
}
interface B18{
    void show();
}
interface C18 extends B18 {
}
class A18 implements C18 {
    public void show() {
        System.out.println("Method executed");
    }
}
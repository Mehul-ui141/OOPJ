//9.Write a program where an abstract class implements an
//interface and a subclass completes the implementation.
package lab6;
interface A4{
    void start();
}
abstract class B4 implements A4{
    public void start(){
        System.out.println("start");
    }
}
class C extends B4{
    public void stop() {
        System.out.println("stop");
    }
}
public class p9{
    public static void main(String[] args) {
        System.out.println("Mehul Jha\n2405287");
        C m=new C();
        m.start();
        m.stop();
    }
}
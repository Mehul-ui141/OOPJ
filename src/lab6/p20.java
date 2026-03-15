//Create a user-defined package, compile it,
// and access its classes from another package.
package lab6;
public class p20 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        C20 t=new C20();
        t.work();
        A20 l=new B20();
        l.work();
    }
}
interface A20{
    void work();
}
class B20 implements A20{
    public void work(){
        System.out.println("Loose coupling");
    }
}
class C20{
    void work(){
        System.out.println("Tight coupling");
    }
}
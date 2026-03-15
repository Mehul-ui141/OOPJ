// Show that an interface reference can refer to different implementing
// class objects and invoke overridden methods.
package lab6;
interface Employ{
    void work();
}
class Manager implements Employ{
    public void work(){
        System.out.println("Manager working");
    }
}
class Clerk implements Employ{
    public void work(){
        System.out.println("Clerk working");
    }
}
public class p14{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Employ e;
        e=new Manager();
        e.work();
        e=new Clerk();
        e.work();
    }
}
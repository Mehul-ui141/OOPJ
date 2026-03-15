//6.Create an abstract class with a template method pattern
//and implement different behaviors in subclasses.
package lab6;
abstract class A3 {
    final void example() {
        start();
        work();
        stop();
    }
    abstract void start();
    abstract void work();
    abstract void stop();
}
class B3 extends A3 {
    void start(){
        System.out.println("start");
    }
    void work(){
        System.out.println("work");
    }
    void stop(){
        System.out.println("stop");
    }
}
public class p6{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A3 a=new B3();
        a.example();
        System.out.println();
    }
}

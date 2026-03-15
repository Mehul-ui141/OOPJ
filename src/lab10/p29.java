//Implement a program demonstrating Reentrant Synchronization
//where one synchronized method calls another synchronized method.
package lab10;
class Thread29{
    synchronized void m1(){
        System.out.println("m1 start");
        m2();
    }
    synchronized void m2(){
        System.out.println("m2 called");
    }
}
public class p29{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Thread29 obj=new Thread29();
        obj.m1();
    }
}

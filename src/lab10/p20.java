//Demonstrate the difference between object-level
// synchronization and class-level synchronization.
package lab10;
class Demo{
    synchronized void objectLock(){
        System.out.println("Object Level Lock");
    }
    static synchronized void classLock(){
        System.out.println("Class Level Lock");
    }
}
public class p20{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Demo d1=new Demo();
        Demo d2=new Demo();
        new Thread(() -> d1.objectLock()).start();
        new Thread(() -> d2.objectLock()).start();
        new Thread(() -> Demo.classLock()).start();
        new Thread(() -> Demo.classLock()).start();
    }
}
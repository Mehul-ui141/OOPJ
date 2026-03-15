//Write a Java program that intentionally creates a deadlock using two
//threads and two shared resources.
package lab10;
class Thread21 extends Thread{
    static Object r1 = new Object();
    static Object r2 = new Object();

    public void run(){
        synchronized(r1){
            System.out.println("Thread1 locked r1");
            synchronized(r2){
                System.out.println("Thread1 locked r2");
            }
        }
    }
}
public class p21{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Thread21 t1 = new Thread21();
        Thread t2 = new Thread(){
            public void run(){
                synchronized(Thread21.r2){
                    System.out.println("Thread2 locked r2");
                    synchronized(Thread21.r1){
                        System.out.println("Thread2 locked r1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
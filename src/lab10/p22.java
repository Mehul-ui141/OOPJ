//22. Modify the above program to avoid deadlock using proper resource
//ordering.
package lab10;
class thread22 extends Thread{
    static Object r1 = new Object();
    static Object r2 = new Object();
    public void run(){
        synchronized(r1){
            synchronized(r2){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
public class p22{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");

        thread22 t1 = new thread22();
        thread22 t2 = new thread22();

        t1.start();
        t2.start();
    }
}
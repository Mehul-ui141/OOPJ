//Create a program demonstrating notifyAll() with multiple waiting
//threads.
package lab10;
class thread25{
    synchronized void waitMethod() throws Exception{
        System.out.println(Thread.currentThread().getName()+" waiting");
        wait();
        System.out.println(Thread.currentThread().getName()+" resumed");
    }
    synchronized void wakeAll(){
        notifyAll();
    }
}
public class p25{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread25 obj=new thread25();
        Runnable r=()->{
            try{ obj.waitMethod(); }catch(Exception e){}
        };
        new Thread(r,"T1").start();
        new Thread(r,"T2").start();
        new Thread(() -> obj.wakeAll()).start();
    }
}
//Write a program demonstrating thread priority scheduling by assigning
//different priorities to three threads.
package lab10;
class multi9 extends Thread {
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
    }
}
public class p9{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        multi9 t1 = new multi9();
        multi9 t2 = new multi9();
        multi9 t3 = new multi9();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
//Create a program where five threads print their thread name, ID, and
//priority while executing.
package lab10;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }
}
public class p4{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(2);
        t4.setPriority(3);
        t5.setPriority(4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
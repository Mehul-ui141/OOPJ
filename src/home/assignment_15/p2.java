package home.assignment_15;
class MyThread extends Thread{
    void setValues(String name, int priority) {
        setName(name);
        setPriority(priority);
    }
    public void run() {
        System.out.println(getName() + " Running with Priority: " + getPriority());
    }
}
public class p2 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287\n");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setValues("Low Thread", Thread.MIN_PRIORITY);  // put values
        t2.setValues("High Thread", Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
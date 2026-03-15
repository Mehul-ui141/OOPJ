package cw;
class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
        System.out.println("Counter value: " + count);
    }
}
class TaskThread implements Runnable {
    Counter c;
    TaskThread(Counter c) {
        this.c = c;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            c.increment();
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}
public class ct {
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Counter c = new Counter();
        Thread t1 = new Thread(new TaskThread(c), "Task-1");
        Thread t2 = new Thread(new TaskThread(c), "Task-2");
        Thread t3 = new Thread(new TaskThread(c), "Task-3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("All tasks completed successfully.");
    }
}
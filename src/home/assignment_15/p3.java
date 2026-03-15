package home.assignment_15;
class MyDaemon extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class p3{
    public static void main(String[] args) {
        System.out.println("Mehul Jha \n2405287\n");
        MyDaemon t1 = new MyDaemon();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread finished");
    }
}
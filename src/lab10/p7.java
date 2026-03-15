//Create a program where one thread monitors the state changes of
//another thread throughout its lifecycle.
package lab10;
class Worker extends Thread {
    public void run() {
        try {
            System.out.println("Mehul Jha");
            System.out.println("2405287");
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
class Monitor extends Thread {
    Thread t;
    Monitor(Thread t) {
        this.t = t;
    }
    public void run() {
        try {
            while (true) {
                System.out.println("Worker State: " + t.getState());
                if (t.getState() == Thread.State.TERMINATED)
                    break;
                Thread.sleep(500);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
public class p7{
    public static void main(String[] args) {
        Worker w = new Worker();
        Monitor m = new Monitor(w);
        m.start();
        w.start();
    }
}
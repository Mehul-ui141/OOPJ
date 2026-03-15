//Implement a program that demonstrates NEW → RUNNABLE →
//TERMINATED thread states clearly.
package lab10;
class multi8 extends Thread {
    public void run() {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
public class p8 {
    public static void main(String[] args) throws Exception {
        multi8 t = new multi8();
        // new
        System.out.println("State after creation: " + t.getState());
        // runnable
        t.start();
        System.out.println("State after start: " + t.getState());
        // waiting
        t.join();
        // terminate
        System.out.println("State after completion: " + t.getState());
    }
}
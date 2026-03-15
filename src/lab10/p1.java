//Write a Java program that creates two threads: one prints even numbers
//and the other prints odd numbers simultaneously.
package lab10;
class EvenThread extends Thread {
    public void run() {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        for(int i=2;i<=10;i+=2){
            System.out.println("Even: " + i);
        }
    }
}
class OddThread extends Thread {
    public void run() {
        for(int i=1;i<=10;i+=2){
            System.out.println("Odd: " + i);
        }
    }
}
public class p1 {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.start();
        t2.start();
    }
}
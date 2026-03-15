//Write a program that interrupts a sleeping thread and handles the
//InterruptedException.
package lab10;
class thread27 extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
    }
}
public class p27{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread27 t=new thread27();
        t.start();
        t.interrupt();
    }
}
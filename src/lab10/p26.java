//Write a program demonstrating daemon thread behavior and show
//how JVM terminates it when user threads finish.
package lab10;
class thread26 extends Thread{
    public void run(){
        while(true){
            System.out.println("Daemon running");
        }
    }
}
public class p26{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread26 t=new thread26();
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread finished");
    }
}
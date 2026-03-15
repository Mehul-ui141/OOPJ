//Write a program where thread names are changed dynamically using setName() and retrieved using getName().
package lab10;
class thread14 extends Thread{
    public void run(){
        System.out.println("Running: "+Thread.currentThread().getName());
    }
}
public class p14{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread14 t1 = new thread14();
        t1.setName("MyThread1");
        t1.start();
    }
}

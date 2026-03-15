//Write a program demonstrating the difference between calling run()
//directly and start().
package lab10;
class multi11 extends Thread {
    public void run(){
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
public class p11{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        multi11 t1 = new multi11();
        System.out.println("Calling run() directly:");
        t1.run();
        System.out.println("Calling start():");
        multi11 t2 = new multi11();
        t2.start();
    }
}
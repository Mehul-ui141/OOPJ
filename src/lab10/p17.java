//Write a program demonstrating synchronized block instead of a synchronized method.
package lab10;
class Ctr{
    int count=0;
    void increment(){
        synchronized(this){
            count++;
        }
    }
}
class thread17 extends Thread{
    Ctr c;
    thread17(Ctr c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}
public class p17{
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Ctr c=new Ctr();
        thread17 t1=new thread17(c);
        thread17 t2=new thread17(c);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Ctr = "+c.count);
    }
}
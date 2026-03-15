//Write a program where multiple threads access a shared counter without
// synchronization and observe inconsistent results.
package lab10;
class ctr{
    int count=0;
    void increment(){
        count++;
    }
}
class thread15 extends Thread{
    ctr c;

    thread15(ctr c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}
public class p15{
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        ctr c=new ctr();
        thread15 t1=new thread15(c);
        thread15 t2=new thread15(c);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("ctr = "+c.count);
    }
}
//Modify the above program using a synchronized method to fix the inconsistency.
package lab10;
class counter{
    int count=0;
    synchronized void increment(){
        count++;
    }
}
class thread16 extends Thread{
    counter c;
    thread16(counter c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<1500;i++){
            c.increment();
        }
    }
}
public class p16{
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        counter c=new counter();
        thread16 t1=new thread16(c);
        thread16 t2=new thread16(c);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("counter = "+c.count);
    }
}
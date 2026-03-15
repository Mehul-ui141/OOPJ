//Implement a Producer–Consumer problem using wait() and notify().
package lab10;
class thread23{
    int item;
    boolean available=false;
    synchronized void produce(int x) throws Exception{
        while(available) wait();
        item=x;
        available=true;
        System.out.println("Produced "+x);
        notify();
    }
    synchronized void consume() throws Exception{
        while(!available) wait();
        System.out.println("Consumed "+item);
        available=false;
        notify();
    }
}
public class p23{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread23 obj=new thread23();
        new Thread(() -> {
            try{ obj.produce(10);}catch(Exception e){}}).start();
        new Thread(() -> {
            try{ obj.consume();}catch(Exception e){}
        }).start();
    }
}
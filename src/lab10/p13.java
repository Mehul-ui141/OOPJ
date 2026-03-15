//Create a program where the main thread waits for child threads using join().
package lab10;
class thread13 extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("Child Thread: "+i);
        }
    }
}
public class p13{
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread13 t1 = new thread13();
        t1.start();
        t1.join();

        System.out.println("Main Thread Finished");
    }
}
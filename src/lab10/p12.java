//Write a program where multiple threads print numbers but pause
//execution using sleep().
package lab10;
class NumThread extends Thread {
    public void run() {
        try {
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(500);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
public class p12 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        NumThread t1 = new NumThread();
        NumThread t2 = new NumThread();
        NumThread t3 = new NumThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
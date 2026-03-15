//Implement a program that checks thread interruption status using
//isInterrupted().
package lab10;
class thread28 extends Thread{
    public void run(){
        while(true){
            if(this.isInterrupted()){
                System.out.println("Interrupted detected");
                break;
            }
        }
    }
}
public class p28{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread28 t=new thread28();
        t.start();
        t.interrupt();
    }
}
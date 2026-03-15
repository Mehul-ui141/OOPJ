//Create a multi-threaded file downloader simulation where multiple
//threads download parts of a file concurrently.
package lab10;
class thread30 extends Thread{
    int part;
    thread30(int p){
        part=p;
    }
    public void run(){
        System.out.println("Downloading part "+part);
    }
}
public class p30{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread30 t1=new thread30(1);
        thread30 t2=new thread30(2);
        thread30 t3=new thread30(3);
        t1.start();
        t2.start();
        t3.start();
    }
}
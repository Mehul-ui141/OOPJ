//Write a program where multiple threads access two different
// objects but synchronize using a static synchronized method.
package lab10;
class Test{
    static synchronized void show(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
class thread19 extends Thread{
    public void run(){
        Test.show();
    }
}

public class p19{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");

        thread19 t1=new thread19();
        thread19 t2=new thread19();

        t1.start();
        t2.start();
    }
}
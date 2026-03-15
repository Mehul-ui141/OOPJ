//Write a program where three threads print messages at different
//intervals using Thread.sleep().
package lab10;
class multi31 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("Multi31: "+ i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class multi32 extends Thread{
    public void run(){
        for(int i=5;i<10;i++){
            System.out.println("Multi32: "+ i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class multi33 implements Runnable{
    public void run(){
        for(int i=10;i<15;i++){
            System.out.println("Multi33: "+ i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class p3 {
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        multi31 t1 = new multi31();
        multi32 t2 = new multi32();
        multi33 t3 = new multi33();
        Thread t4 = new Thread(t3);
        t1.start();
        t2.start();
        t4.start();
    }
}

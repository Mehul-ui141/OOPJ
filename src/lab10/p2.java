//Implement multithreading using both Thread class and Runnable
//interface in the same program and compare their outputs.
package lab10;
class multi21 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("No: " + i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class multi22 implements Runnable{
    public void run(){
        for(int i=5;i<11;i++){
            System.out.println("No: " + i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class p2 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        multi21 t1 = new multi21();
        multi22 t2 = new multi22();
        Thread t3 = new Thread(t2);
        t1.start();
        t3.start();
    }
}
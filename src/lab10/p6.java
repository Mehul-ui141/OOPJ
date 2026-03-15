//Write a Java program to display the state of a thread at different stages
//using getState().
package lab10;
class multi6 extends Thread{
    public void run(){
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thread running");
    }
}
public class p6{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        multi6 t1 = new multi6();
        System.out.println("State after creation: " + t1.getState());
        t1.start();
        System.out.println("State after start: " + t1.getState());
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("State during execution: " + t1.getState());
    }
}
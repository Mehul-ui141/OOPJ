//Write a program where one thread waits for another thread to deposit
//money before withdrawing.
package lab10;
class thread24{
    int balance=0;
    synchronized void deposit(int amt){
        balance+=amt;
        System.out.println("Deposited "+amt);
        notify();
    }
    synchronized void withdraw(int amt) throws Exception{
        if(balance<amt){
            System.out.println("Waiting for deposit");
            wait();
        }
        balance-=amt;
        System.out.println("Withdrawn "+amt);
    }
}
public class p24{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        thread24 b=new thread24();
        new Thread(() -> {
            try{ b.withdraw(500);}catch(Exception e){}
        }).start();
        new Thread(() -> b.deposit(500)).start();
    }
}
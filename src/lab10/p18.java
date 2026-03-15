//Create a banking system where multiple threads try to withdraw
//money simultaneously and use synchronization to prevent incorrect balances.
package lab10;
class Bank{
    int balance=1000;
    synchronized void withdraw(int amt){
        if(balance>=amt){
            balance=balance-amt;
            System.out.println("Withdrawn "+amt+" Balance "+balance);
        }
    }
}
class thread18 extends Thread{
    Bank b;
    thread18(Bank b){
        this.b=b;
    }
    public void run(){
        b.withdraw(500);
    }
}
public class p18{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Bank b=new Bank();
        thread18 t1=new thread18(b);
        thread18 t2=new thread18(b);
        t1.start();
        t2.start();
    }
}
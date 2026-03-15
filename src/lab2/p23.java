//Create a class Account with accountNo, name, balance.
//Write functions to deposit, withdraw, and display balance
package lab2;
import java.util.Scanner;
class account{
    int accno;
    String name;
    float balance;
    void deposit(float amt){
        balance+=amt;
    }
    void withdraw(float amt){
        if(amt<=balance){
            balance-=amt;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    void display(){
        System.out.println("Account No: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
public class p23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        account acc=new account();
        System.out.print("Enter Account No: ");
        acc.accno=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        acc.name=sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        acc.balance=sc.nextFloat();
        System.out.print("Enter amount to deposit: ");
        float depAmt=sc.nextFloat();
        acc.deposit(depAmt);
        System.out.print("Enter amount to withdraw: ");
        float withAmt=sc.nextFloat();
        acc.withdraw(withAmt);
        acc.display();
    }
}
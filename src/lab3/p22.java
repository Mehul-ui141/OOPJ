//Create a Bankacc class and remove all zero-balance accounts.
package lab3;
import java.util.Scanner;
class Bankacc {
    int accNo;
    String name;
    double balance;
}
public class p22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();
        Bankacc[] acc = new Bankacc[n];
        for (int i=0;i<n;i++) {
            acc[i]=new Bankacc();
            System.out.println("Enter details of account " + (i + 1));
            System.out.print("Account Number: ");
            acc[i].accNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Account Holder Name: ");
            acc[i].name=sc.nextLine();
            System.out.print("Balance: ");
            acc[i].balance = sc.nextDouble();
        }
        int count=0;
        for (int i=0;i<n;i++) {
            if (acc[i].balance != 0) {
                count++;
            }
        }
        Bankacc[] updated=new Bankacc[count];
        int index=0;
        for (int i=0;i<n;i++) {
            if (acc[i].balance != 0) {
                updated[index++]=acc[i];
            }
        }
        System.out.println("Accounts after removing zero-balance accounts:");
        for (int i=0;i<count;i++) {
            System.out.println(updated[i].accNo + " | " + updated[i].name + " | Balance: " + updated[i].balance
            );
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
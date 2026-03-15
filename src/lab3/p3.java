//Create a BankAccount class and find total balance of all savings accounts only
package lab3;
import java.util.Scanner;
class BankAccount{
    int accno;
    String acctype;
    double balance;
}
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n=sc.nextInt();
        sc.nextLine();
        BankAccount[] accounts = new BankAccount[n];
        for (int i=0;i<n;i++) {
            accounts[i] = new BankAccount();
            System.out.println("Enter details for account " + (i + 1));
            System.out.print("Account Number: ");
            accounts[i].accno=sc.nextInt();
            sc.nextLine();
            System.out.print("Account Type (Savings/Current): ");
            accounts[i].acctype=sc.nextLine();
            System.out.print("Balance: ");
            accounts[i].balance=sc.nextDouble();
        }
            double totalSavings=0;
            for (int i=0;i<n;i++) {
                if (accounts[i].acctype.equalsIgnoreCase("Savings")) {
                    totalSavings+=accounts[i].balance;
                }
            }
            System.out.println("Total balance of Savings accounts: " + totalSavings);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
// Create a Customer class and search customer by email ID.
package lab3;
import java.util.Scanner;
class Customer{
    int id;
    String name;
    String email;
}
public class p12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of customers:");
        int n=sc.nextInt();
        sc.nextLine();
        Customer[] C=new Customer[n];
        for (int i=0;i<n;i++) {
            C[i] = new Customer();
            System.out.println("Enter customer details " + (i + 1));
            System.out.print("ID: ");
            C[i].id=sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            C[i].name=sc.nextLine();
            System.out.print("Email: ");
            C[i].email=sc.nextLine();
        }
        System.out.println("ID to search:");
        String searchEmail=sc.nextLine();
        boolean found=false;
        for (int i=0;i<n;i++) {
            if (C[i].email.equalsIgnoreCase(searchEmail)) {
                System.out.println("Customer Found:");
                System.out.println("ID: " + C[i].id);
                System.out.println("Name: " + C[i].name);
                System.out.println("Email: " + C[i].email);
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Customer not found");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

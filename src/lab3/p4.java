//Create a Book class and display books published after a given year.
package lab3;
import java.util.Scanner;
class Books{
    int year;
    String name;
    double price;
}
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of books");
        int n = sc.nextInt();
        sc.nextLine();
        Books[] B = new Books[n];
        for (int i = 0; i < n; i++) {
            B[i] = new Books();
            System.out.println("Enter book details " + (i + 1));
            System.out.print("Book Name: ");
            B[i].name = sc.nextLine();
            System.out.print("Printing year:");
            B[i].year = sc.nextInt();
            sc.nextLine();
            System.out.print("Price: ");
            B[i].price = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Enter Given Year:");
        int a=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (B[i].year > a) {
                System.out.println("Name: " + B[i].name + ", Year: " + B[i].year + ", Price: " + B[i].price);
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

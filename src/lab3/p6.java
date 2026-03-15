//Create a Prod class and detect duplicate product IDs using array of objects.
package lab3;
import java.util.Scanner;
class Prod {
    int id;
    String name;
    double price;
}
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Prod[] p = new Prod[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Prod();
            System.out.println("Enter details of product " + (i + 1));
            System.out.print("Prod ID: ");
            p[i].id = sc.nextInt();
            sc.nextLine();
            System.out.print("Prod Name: ");
            p[i].name = sc.nextLine();
            System.out.print("Price: ");
            p[i].price = sc.nextDouble();
        }
        System.out.println("Duplicate Prod IDs:");
        boolean a = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i].id == p[j].id) {
                    System.out.println(p[i].id);
                    a = true;
                }
            }
        }
        if (!a) {
            System.out.println("No duplicate product IDs found.");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
//Create a Vehicle class and separate two-wheelers and four-wheelers.
package lab3;
import java.util.Scanner;
class Vehicle{
    int wheels;
    String name;
}
public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of Cars");
        int n = sc.nextInt();
        Vehicle[] vc = new Vehicle[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            vc[i] = new Vehicle();
            System.out.println("Enter car details: " + (i + 1));
            System.out.println("Enter Vehicle name:");
            vc[i].name = sc.nextLine();
            System.out.println("Enter No of Wheels:");
            vc[i].wheels = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Two wheelers:");
        for (int i = 0; i < n; i++) {
            if (vc[i].wheels == 2) {
                System.out.println("Name " + vc[i].name);
            }
        }
        System.out.println("Four wheelers:");
        for (int i = 0; i < n; i++) {
            if (vc[i].wheels == 4) {
                System.out.println("Name " + vc[i].name);
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
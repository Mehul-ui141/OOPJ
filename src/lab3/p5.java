//Create a Car class and count cars of a specific brand.
package lab3;
import java.util.Scanner;
class Car {
    String carname;
    String brand;
    void input(Scanner sc) {
        System.out.print("Enter car name: ");
        carname = sc.nextLine();
        System.out.print("Enter brand: ");
        brand = sc.nextLine();
    }
}
public class p5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int n=sc.nextInt();
        sc.nextLine();
        Car[] c=new Car[n];
        for (int i=0;i<n;i++) {
            c[i]=new Car();
            System.out.println("Enter details of car " + (i + 1));
            c[i].input(sc);
        }
        System.out.print("Enter car brand to count: ");
        String b=sc.nextLine();
        int count=0;
        for (int i=0;i<n;i++) {
            if (c[i].brand.equalsIgnoreCase(b)) {
                count++;
            }
        }
        System.out.println("Number of cars of brand " + b+ ": " + count);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
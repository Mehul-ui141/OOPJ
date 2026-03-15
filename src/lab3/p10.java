//Create a LAPTOP class and find the laptop with minimum price and maximum RAM.
package lab3;
import java.util.Scanner;
class LAPTOP{
    String Brand;
    int ram;
    double price;
}
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Laptop: ");
        int n = sc.nextInt();
        sc.nextLine();
        LAPTOP[] L = new LAPTOP[n];
        for (int i=0;i<n;i++){
            L[i]=new LAPTOP();
            System.out.println("Enter details of Laptop " + (i + 1));
            System.out.print("Brand: ");
            L[i].Brand=sc.nextLine();
            System.out.print("Ram: ");
            L[i].ram=sc.nextInt();
            sc.nextLine();
            System.out.print("Price: ");
            L[i].price=sc.nextDouble();
            sc.nextLine();
        }
        LAPTOP minprice = L[0];
        LAPTOP maxram = L[0];
        for (int i=1;i<n;i++) {
            if (L[i].price < minprice.price) {
                minprice = L[i];
            }
            if (L[i].ram > maxram.ram) {
                maxram = L[i];
            }
        }
        System.out.println("Laptop with Minimum Price:");
        System.out.println(minprice.Brand + " | RAM: " + minprice.ram + "GB | Price: " + minprice.price);
        System.out.println("\nLAPTOP with Maximum RAM:");
        System.out.println(maxram.Brand + " | RAM: " + maxram.ram + "GB | Price: " + maxram.price);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
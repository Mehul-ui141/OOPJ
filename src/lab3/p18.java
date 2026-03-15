//Create a Product class and apply discount to products above a given price.
package lab3;
import java.util.Scanner;
class Product {
    int id;
    String name;
    double price;
}
public class p18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n=sc.nextInt();
        sc.nextLine();
        Product[] p=new Product[n];
        for (int i=0;i<n;i++) {
            p[i]=new Product();
            System.out.println("Enter details of Product " + (i + 1));
            System.out.print("Product ID: ");
            p[i].id=sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            p[i].name=sc.nextLine();
            System.out.print("Price: ");
            p[i].price=sc.nextDouble();
        }
        System.out.print("Enter price above which discount is applied: ");
        double limit=sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount=sc.nextDouble();
        for (int i=0;i<n;i++) {
            if (p[i].price>limit) {
                p[i].price=p[i].price-(p[i].price*discount/100);
            }
        }
        System.out.println("Product Details After Discount:");
        for (int i=0;i<n;i++) {
            System.out.println(p[i].id + " " + p[i].name + " Price: " + p[i].price);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
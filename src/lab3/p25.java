//Create an Item class and find most expensive item using object comparison.
package lab3;
import java.util.Scanner;
class Item {
    int itemId;
    String name;
    double price;
}
public class p25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n=sc.nextInt();
        sc.nextLine();
        Item[] items=new Item[n];
        for (int i=0;i<n;i++) {
            items[i]=new Item();
            System.out.println("Enter details of item " + (i + 1));
            System.out.print("Item ID: ");
            items[i].itemId=sc.nextInt();
            sc.nextLine();
            System.out.print("Item Name: ");
            items[i].name=sc.nextLine();
            System.out.print("Price: ");
            items[i].price=sc.nextDouble();
        }
        Item expensive=items[0];
        for (int i=1;i<n;i++) {
            if (items[i].price>expensive.price) {
                expensive=items[i];
            }
        }
        System.out.println("Most Expensive Item:");
        System.out.println(expensive.itemId + " | " + expensive.name + " | Price: " + expensive.price);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
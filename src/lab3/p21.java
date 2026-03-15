//Create a Book class and merge two arrays of books without duplicates.
package lab3;
import java.util.Scanner;
class Book {
    int bookId;
    String title;
    double price;
}
public class p21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of books in first array: ");
        int n1=sc.nextInt();
        sc.nextLine();
        Book[] b1=new Book[n1];
        for (int i=0;i<n1;i++) {
            b1[i]=new Book();
            System.out.println("Enter book " + (i + 1) + " details:");
            System.out.print("Book ID: ");
            b1[i].bookId = sc.nextInt();
            sc.nextLine();
            System.out.print("Title: ");
            b1[i].title=sc.nextLine();
            System.out.print("Price: ");
            b1[i].price = sc.nextDouble();
            sc.nextLine();
        }
        System.out.print("Enter number of books in second array: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        Book[] b2=new Book[n2];
        for (int i=0;i<n2;i++) {
            b2[i]=new Book();
            System.out.println("Enter book " + (i + 1) + " details:");
            System.out.print("Book ID: ");
            b2[i].bookId=sc.nextInt();
            sc.nextLine();
            System.out.print("Title: ");
            b2[i].title = sc.nextLine();
            System.out.print("Price: ");
            b2[i].price=sc.nextDouble();
            sc.nextLine();
        }
        Book[] merged=new Book[n1 + n2];
        int count=0;
        for(int i=0;i<n1;i++) {
            merged[count++]=b1[i];
        }
        for(int i=0;i<n2;i++) {
            boolean duplicate=false;
            for (int j=0 ;j<count;j++) {
                if (b2[i].bookId==merged[j].bookId) {
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                merged[count++]=b2[i];
            }
        }
        System.out.println("Merged Book List (No Duplicates):");
        for (int i=0;i<count;i++) {
            System.out.println(merged[i].bookId + " | " + merged[i].title + " | " + merged[i].price);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
//Create a Library class and implement search, issue, and return using array of objects.
package lab3;
import java.util.Scanner;
class Library {
    String title;
    String author;
    boolean issued;
}
public class p27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n=sc.nextInt();
        sc.nextLine();
        Library[] b = new Library[n];
        for (int i=0;i<n;i++) {
            b[i]=new Library();
            System.out.println("Enter details of book " + (i + 1));
            System.out.print("Title: ");
            b[i].title=sc.nextLine();
            System.out.print("Author: ");
            b[i].author=sc.nextLine();
            b[i].issued=false;
        }
        System.out.print("Enter Title: ");
        String search=sc.nextLine();
        boolean found=false;
        for (int i=0;i<n;i++) {
            if (b[i].title.equalsIgnoreCase(search)) {
                System.out.println("Book Found");
                System.out.println("Title: " + b[i].title);
                System.out.println("Author: " + b[i].author);
                System.out.println("Status: " + (b[i].issued ? "Issued" : "Available"));
                found=true;
                if (!b[i].issued) {
                    b[i].issued = true;
                    System.out.println("Book Issued Successfully");
                }
                else {
                    System.out.println("Book already issued");
                }
                b[i].issued=false;
                System.out.println("Book Returned Successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

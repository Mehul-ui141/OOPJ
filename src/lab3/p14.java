// Create a Train class and display trains between source and destination.
package lab3;
import java.util.Scanner;
class Train{
    String name;
    String src;
    String dest;
}
public class p14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Trains:");
        int n=sc.nextInt();
        sc.nextLine();
        Train[] T = new Train[n];
        for(int i=0;i<n;i++){
            T[i]=new Train();
            System.out.println("Enter Train details " + (i + 1));
            System.out.println("Enter Train name:");
            T[i].name=sc.nextLine();
            System.out.println("Enter Source:");
            T[i].src=sc.nextLine();
            System.out.println("Enter Destination:");
            T[i].dest = sc.nextLine();
        }
        System.out.println("Enter Source to search:");
        String src=sc.nextLine();
        System.out.println("Enter Destination to search:");
        String dest=sc.nextLine();
        System.out.println("Trains between " + src + " and " + dest + ":");
        boolean found = false;

        // Display matching trains
        for (int i = 0; i < n; i++) {
            if (T[i].src.equalsIgnoreCase(src) && T[i].dest.equalsIgnoreCase(dest)) {
                System.out.println("Train No: " + ", Name: " + T[i].name);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No trains found.");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
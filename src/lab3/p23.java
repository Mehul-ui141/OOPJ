// Create a Hotel class and find highest-rated hotel city-wise.
package lab3;
import java.util.Scanner;
class Hotel {
    int hotelId;
    String name;
    String city;
    float rating;
}
public class p23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of hotels: ");
        int n=sc.nextInt();
        sc.nextLine();
        Hotel[] h=new Hotel[n];
        for (int i=0;i<n;i++) {
            h[i]=new Hotel();
            System.out.println("Enter details of hotel " + (i + 1));
            System.out.print("Hotel ID: ");
            h[i].hotelId=sc.nextInt();
            sc.nextLine();
            System.out.print("Hotel Name: ");
            h[i].name=sc.nextLine();
            System.out.print("City: ");
            h[i].city=sc.nextLine();
            System.out.print("Rating: ");
            h[i].rating=sc.nextFloat();
            sc.nextLine();
        }
        System.out.println("City-wise Highest Rated Hotel:");
        for (int i=0;i<n;i++){
            boolean found = false;
            for (int k=0;k<i;k++) {
                if (h[i].city.equalsIgnoreCase(h[k].city)) {
                    found = true;
                    break;
                }
            }
            if (!found){
                Hotel highest = h[i];
                for (int j=i+1;j<n;j++) {
                    if (h[j].city.equalsIgnoreCase(h[i].city) && h[j].rating > highest.rating) {
                        highest = h[j];
                    }
                }
                System.out.println(highest.city + " → " + highest.name + " | Rating: " + highest.rating);
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
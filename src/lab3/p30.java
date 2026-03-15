//Create a Hotels class and sort hotels by rating and then by price.
package lab3;
import java.util.Scanner;
class Hotels{
    String name;
    double rating;
    double price;
}
public class p30{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Hotels:");
        int n=sc.nextInt();
        sc.nextLine();
        Hotels[] H = new Hotels[n];
        for(int i=0;i<n;i++){
            H[i]=new Hotels();
            System.out.println("Enter Hotels details " + (i + 1));
            System.out.println("Enter Hotels name:");
            H[i].name=sc.nextLine();
            System.out.println("Enter Rating:");
            H[i].rating=sc.nextDouble();
            System.out.println("Enter Price:");
            H[i].price=sc.nextDouble();
            sc.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(H[i].rating<H[j].rating || (H[i].rating == H[j].rating && H[i].price > H[j].price)){
                    Hotels temp=H[i];
                    H[i]=H[j];
                    H[j]=temp;
                }
            }
        }
        System.out.println("\nHotels sorted by Rating and then by Price:");
        for(int i = 0; i < n; i++){
            System.out.println("Name: " + H[i].name + " | Rating: " + H[i].rating + " | Price: " + H[i].price);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

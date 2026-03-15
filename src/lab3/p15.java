//Create a Mobile class and count mobiles in different price ranges.
package lab3;
import java.util.Scanner;
class Mobile{
    String brand;
    double price;
}
public class p15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Mobiles:");
        int n=sc.nextInt();
        sc.nextLine();
        Mobile[] M=new Mobile[n];
        for(int i=0;i<n;i++){
            M[i] = new Mobile();
            System.out.println("Enter Mobile details " + (i + 1));
            System.out.println("Enter Brand:");
            M[i].brand = sc.nextLine();
            System.out.println("Enter Price:");
            M[i].price=sc.nextDouble();
            sc.nextLine();
        }
        int low=0,mid=0,high = 0;
        for(int i=0;i<n;i++){
            if(M[i].price<10000)
                low++;
            else if(M[i].price>=10000 && M[i].price<=20000)
                mid++;
            else
                high++;
        }
        System.out.println("Mobile Count in Different Price Ranges:");
        System.out.println("Below 10000: " + low);
        System.out.println("Between 10000 and 20000: " + mid);
        System.out.println("Above 20000: " + high);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
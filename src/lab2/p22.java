//Create a class Rectangle with length & breadth.
//Write methods to compute area, perimeter and display them
package lab2;
import java.util.Scanner;
class rectangle{
    int len, brd;
    void imupt(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        len=sc.nextInt();
        System.out.print("Enter breadth:");
        brd=sc.nextInt();
    }
    void display(){
        System.out.println("Length: " + len);
        System.out.println("Breadth: " + brd);
        int area=len*brd;
        System.out.println("Area: " + area);
        int peri=2*(len + brd);
        System.out.println("Perimeter: " + peri);
    }
}
public class p22{
    public static void main(String[] args) {
        rectangle rec=new rectangle();
        rec.imupt();
        rec.display();
        System.out.println("\nMehul Jha");
        System.out.println("2405287");
    }
}

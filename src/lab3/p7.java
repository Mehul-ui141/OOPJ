//Create a Rectangle class and find the rectangle with maximum area.
package lab3;
import java.util.Scanner;
class Rectangle {
    int l, b;
    void input(Scanner sc){
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
    }
    int area() {
        return l * b;
    }
}
public class p7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rect1=new Rectangle();
        System.out.println("Enter details for Rectangle 1:");
        rect1.input(sc);
        Rectangle rect2=new Rectangle();
        System.out.println("Enter details for Rectangle 2:");
        rect2.input(sc);
        if (rect1.area() > rect2.area()) {
            System.out.println("Rectangle 1 has a larger area.");
        }
        else if (rect1.area() < rect2.area()) {
            System.out.println("Rectangle 2 has a larger area.");
        }
        else {
            System.out.println("Both boxes have the same area.");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
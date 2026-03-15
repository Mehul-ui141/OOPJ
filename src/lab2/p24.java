// Create a class Box with (height, width, depth) and compute volume.
//Create two objects and compare which box has larger volume.
package lab2;
import java.util.Scanner;
class Box {
    int h, w, d;
    void input(Scanner sc){
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.print("Enter width: ");
        w = sc.nextInt();
        System.out.print("Enter depth: ");
        d = sc.nextInt();
    }
    int volume() {
        return h * w * d;
    }
}
public class p24{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Box box1=new Box();
        System.out.println("Enter details for Box 1:");
        box1.input(sc);
        Box box2=new Box();
        System.out.println("Enter details for Box 2:");
        box2.input(sc);
        if (box1.volume()>box2.volume()) {
            System.out.println("\nBox 1 has a larger volume.");
        }
        else if (box1.volume()<box2.volume()) {
            System.out.println("\nBox 2 has a larger volume.");
        }
        else {
            System.out.println("\nBoth boxes have the same volume.");
        }
        System.out.println("\nMehul Jha");
        System.out.println("2405287");
    }
}
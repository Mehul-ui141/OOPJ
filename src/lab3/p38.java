//Write a program that accepts array size and elements via command line arguments, stores
//them in an array of objects, and prints the details.
package lab3;
class value {
    int value;
    void input(int v) {
        value=v;}
    void display() {
        System.out.println("Element value: " + value);
    }
}
public class p38{
    public static void main(String[] args) {
        int size=Integer.parseInt(args[0]);
        if (args.length != size+1) {
            System.out.println("Please enter corectly");
            return;
        }
        value[] a=new value[size];
        for (int i=0;i<size;i++) {
            int val=Integer.parseInt(args[i + 1]);
            a[i]=new value();
            a[i].input(val);}
        System.out.println("Array Elements:");
        for (int i=0;i<size;i++) {
            a[i].display();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
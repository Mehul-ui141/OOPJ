//Write a program to demonstrate marker interfaces and their use in Java.
package lab6;
public class p15{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A15 f=new A15();
        if (f instanceof marker){
            System.out.println("Marker detected: Access allowed");
            f.read();
        }
        else{
            System.out.println("Access denied");
        }
    }
}
interface marker{
}
class A15 implements marker{
    public void read() {
        System.out.println("Reading file data...");
    }
}
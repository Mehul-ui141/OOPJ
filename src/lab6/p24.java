//Write a program to show how protected members
// behave in inheritance across packages
package lab6;
import pack.A24;
public class p24 extends A24 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        p24 a = new p24();
        a.show();
    }
}

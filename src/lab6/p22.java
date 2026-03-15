//Write a program to demonstrate access control (public, default, protected) across packages
package lab6;
import pack.A22;
public class p22 extends A22{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        p22 a = new p22();
        a.pub();
        a.pro();
    }
}
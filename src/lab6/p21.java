//Create a user-defined package, compile it,
// and access its classes from another package.
package lab6;
import pack.A21;
public class p21 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        A21 a = new A21();
        a.show();
    }
}
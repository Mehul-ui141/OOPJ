//Demonstrate name conflict resolution using packages.
package lab6;
public class p25 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        pack.A25 a1 = new pack.A25();
        pack2.B25 a2 = new pack2.B25();
        a1.show();
        a2.show();
    }
}
//Demonstrate that a final variable cannot be modified.
package lab5;
class modify {
    final int x = 10;
    void change() {
         int x = 20; // isme int hata dena
        System.out.println("x = " + x);
    }
}
public class p11 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        modify d = new modify();
        d.change();
    }
}
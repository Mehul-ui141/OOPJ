//Show behavior of a final reference variable.
package lab5;
class Box{
    int length=10;
}
public class p15{
    public static void main(String[] args) {
        final Box b=new Box();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        b.length=11;
        System.out.println("Length: " + b.length);
    }
}
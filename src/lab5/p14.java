//Demonstrate that a final class cannot be inherited.
package lab5;
final class p14{
    void show(){
        System.out.println("This is a final class");
    }
}
class Test {
    public static void main(String[] args) {
        p14 obj = new p14();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        obj.show();
    }
}
//Demonstrate variable shadowing and resolution using super.
package lab5;
class Math{
    int x=67;
}
class Algebra extends Math{
    int x=98;
    void show(){
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
public class p8{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        new Algebra().show();
    }
}
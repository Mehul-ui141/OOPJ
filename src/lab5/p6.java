//Write a program where omission of super() causes a compilation error.
package lab5;
class Cow{
    Cow(){
        System.out.println("Cow" );
    }
}
class Rabbit extends Cow {
    Rabbit(){
        System.out.println("Rabbit");
    }
}
public class p6{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Rabbit r1=new Rabbit();
    }
}
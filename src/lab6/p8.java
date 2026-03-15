//8.Demonstrate why an abstract class cannot be instantiated,
// but its reference can be used.
package lab6;
abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    void sound() {
        System.out.println("barking");
    }
}

public class p8{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        //Animal a=new Animal();
        Animal a = new Dog();
        a.sound();
    }
}
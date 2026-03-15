package home.assignment_8;

public class p5{
    public static void main(String args[]) {
        Dog d = new Dog();
        d.work();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }
    void bark() {
        System.out.println("barking...");
    }
    void work() {
        super.eat();
        bark();
    }
}
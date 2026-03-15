//Override a method in a child class and invoke the
// parent version using super.method().
package lab5;
class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        super.eat(); // parent method
        bark();
    }
}
class p3{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Dog d=new Dog();
        d.work();
    }
}
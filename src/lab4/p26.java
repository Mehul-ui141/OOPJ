//Write a program showing difference between inheritance and aggregation.
package lab4;
class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Engine1{
    int power;
    Engine1(int power){
        this.power=power;
    }
}
class Cars{
    Engine1 engine;
    Cars(Engine1 engine){
        this.engine=engine;
    }
    void show(){
        System.out.println("Engine1 Power: "+engine.power);
    }
}
public class p26{
    public static void main(String[] args){
        System.out.println("Inheritance:");
        Dog d=new Dog();
        d.eat();
        d.bark();
        System.out.println("Aggregation:");
        Engine1 e=new Engine1(120);
        Cars c=new Cars(e);
        c.show();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
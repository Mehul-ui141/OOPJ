//7.Write a program to show runtime polymorphism
// using an abstract class reference.
package lab6;
abstract class Car{
    abstract void run();
}
class SUV extends Car{
    void run(){
        System.out.println("SUV running");
    }
}
public class p7{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Car c=new SUV();
        c.run();
    }
}
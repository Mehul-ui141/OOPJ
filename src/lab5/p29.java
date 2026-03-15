//Show that constructors do not support runtime polymorphism.
package lab5;
class Vehicle2{
    Vehicle2(){
        System.out.println("Vehicle constructor");
    }
}
class Car2 extends Vehicle2 {
    Car2(){
        System.out.println("Car constructor");
    }
    public static void main(String[] args) {
        Vehicle2 v=new Car2();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

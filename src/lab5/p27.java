//Show that runtime polymorphism does not apply to instance variables.
package lab5;
class A27{
    int speed = 60;
}
class Bike2 extends A27 {
    int speed=89;
    public static void main(String[] args) {
        A27 b= new Bike2();
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        System.out.println("Speed: " + b.speed);
    }
}

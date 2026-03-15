//3.Write a program where an abstract class has:
//A. Instance variables
//B. Final methods  Show how subclasses interact with them.
package lab6;
abstract class Bike{
    int speed=160;
    final void showSpeed(){
        System.out.println("Speed: " + speed);
    }
}
class SportsBike extends Bike{
    void increaseSpeed(){
        speed=180;
    }
}
public class p3{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        SportsBike b=new SportsBike();
        b.increaseSpeed();
        b.showSpeed();
    }
}
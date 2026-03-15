// Demonstrate polymorphism using arrays of parent-class references.
package lab5;
public class p34{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Shapes s=new Circles();
        s.draw();
        s=new Rectangles();
        s.draw();
    }
}
class Shapes{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class Circles extends Shapes{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Rectangles extends Shapes{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}
//Write a program to show constructor overloading using a Box class (cube and cuboid).
package lab4;
class Box{
    double len,wd,ht;
    Box(double side) {
        len=wd=ht=side;
    }
    Box(double l, double w, double h) {
        len=l;
        wd=w;
        ht=h;
    }
    double volume() {
        return len*wd*ht;
    }
}
public class p4{
    public static void main(String[] args) {
        Box cube = new Box(5);
        Box cuboid = new Box(4, 3, 2);
        System.out.println("Volume of Cube: " + cube.volume());
        System.out.println("Volume of Cuboid: " + cuboid.volume());
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

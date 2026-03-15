// Show how to use static import and explain when it is useful.
package lab6;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
public class p27{
    public static void main(String[] args) {
        double radius=9;
        double area=PI*radius*radius;
        double root=sqrt(64);
        System.out.println("Area of circle: " + area);
        System.out.println("Square root of 64: " + root);
    }
}
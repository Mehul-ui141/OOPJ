//11. Write a Java program to demonstrate:
//A. Multiple inheritance using interfaces
//B. Conflict resolution of default methods.
package lab6;
interface Book1{
    default void read(){
        System.out.println("Reading Book1");
    }
}
interface Book2{
    default void read() {
        System.out.println("Reading Book2");
    }
}
class Reader implements Book1, Book2{
    public void read(){
        Book2.super.read();
    }
}
public class p11{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Reader r=new Reader();
        r.read();
    }
}
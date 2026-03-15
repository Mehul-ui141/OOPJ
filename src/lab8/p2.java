//Write a Java program to demonstrate immutability of the String class with
//suitable examples.
package lab8;
public class p2{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String a="Sachin";
        System.out.println("Before: "+a);
        a.concat("Tendulkar");
        System.out.println("After: "+a);
    }
}

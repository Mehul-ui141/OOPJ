//Write a program that catches a parent exception class
// instead of child exceptions and analyze the effect.
package lab7;
public class p8{
    public static void main(String[] args){
        try{
            int a=10/0;
        }
        catch(RuntimeException e){
            System.out.println("Runtime caught");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
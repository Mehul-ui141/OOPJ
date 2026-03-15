//Write a program to demonstrate multi-catch (|) introduced in Java 7.
package lab7;
public class p10{
    public static void main(String[] args){
        try{
            int a=Integer.parseInt("a");
        }
        catch(ArithmeticException | NumberFormatException e){
            System.out.println("Handled");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
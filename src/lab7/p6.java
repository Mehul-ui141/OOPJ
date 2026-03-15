// Write a program that uses multiple catch blocks for different runtime exceptions.
package lab7;
public class p6{
    public static void main(String[] args){
        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic");
        }
        catch(Exception e){
            System.out.println("General");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
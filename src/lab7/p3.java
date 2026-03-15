//Write a program to handle NumberFormatException when converting a string to an integer.
package lab7;
public class p3{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try{
            int x=Integer.parseInt("abc");
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number");
        }
    }
}
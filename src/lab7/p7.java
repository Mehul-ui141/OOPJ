//Write a program to demonstrate the importance of catch block order in exception handling.
package lab7;
public class p7{
    public static void main(String[] args){
        try{
            int a=10/0;
        }
        catch(Exception e){
            System.out.println("Parent");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
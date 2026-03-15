//Write a program that safely handles NullPointerException
// while accessing object methods.
package lab7;
public class p4{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try{
            String s=null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("Null object");
        }
    }
}
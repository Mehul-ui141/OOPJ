// Write a program that shows how exception hierarchy works using built-in exceptions.
package lab7;
public class p9{
    public static void main(String[] args){
        try{
            String s=null;
            s.length();
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
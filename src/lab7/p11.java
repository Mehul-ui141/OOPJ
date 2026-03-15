// Write a program to show that the finally block executes
// even when an exception occurs.
package lab7;
public class p11{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try{
            int a=10/0;
        }
        finally{
            System.out.println("Finally runs");
        }
    }
}
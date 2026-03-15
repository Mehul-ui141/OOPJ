//Write a program to demonstrate and handle ArrayIndexOutOfBoundsException.
package lab7;
public class p2{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        try{
            int a[]={1,2};
            System.out.println(a[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}
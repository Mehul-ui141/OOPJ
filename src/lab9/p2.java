//Write a program to read a single character using System.in.read() and
//display its ASCII value and character representation.
package lab9;
public class p2{
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        System.out.println("Enter a character:");
        int ch = System.in.read();
        System.out.println("ASCII value = " + ch);
        System.out.println("Character = " + (char)ch);
    }
}
//Write a program to read multiple characters from System.in until newline
//and display them.
package lab9;
public class p3{
    public static void main(String[] args) throws Exception{
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        System.out.println("Enter text: ");
        int ch = System.in.read();
        while (ch != '\n') {
            System.out.print((char) ch);
            ch = System.in.read();
        }
    }
}
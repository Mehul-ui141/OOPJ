//Write a Java program to implement a simple Caesar Cipher encryption and
//decryption technique.
package lab8;
import java.util.Scanner;
public class p28 {
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();
        String encrypt = "";
        String decrypt = "";
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                encrypt += (char)((ch - 'A' + shift) % 26 + 'A');
            else if(ch >= 'a' && ch <= 'z')
                encrypt += (char)((ch - 'a' + shift) % 26 + 'a');
            else
                encrypt += ch;
        }
        for(int i = 0; i < encrypt.length(); i++) {
            char ch = encrypt.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                decrypt += (char)((ch - 'A' - shift + 26) % 26 + 'A');
            else if(ch >= 'a' && ch <= 'z')
                decrypt += (char)((ch - 'a' - shift + 26) % 26 + 'a');
            else
                decrypt += ch;
        }
        System.out.println("Encrypted Text: " + encrypt);
        System.out.println("Decrypted Text: " + decrypt);
    }
}

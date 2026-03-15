//Write a program to count number of vowels, consonants, digits, and
//special characters in a file.
package lab9;
import java.io.FileInputStream;
public class p11{
    public static void main(String[] args) throws Exception {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        FileInputStream f = new FileInputStream("C:\\OOPJ\\data3.txt");
        int ch, v = 0, c = 0, d = 0, s = 0;
        while ((ch = f.read()) != -1) {
            char x = (char) ch;
            if (x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z') {
                if (x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||
                        x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
                    v++;
                else
                    c++;
            }
            else if (x >= '0' && x <= '9')
                d++;
            else if (x!=' ' && x!='\n' && x!='\r')
                s++;
        }
        f.close();
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Special: " + s);
    }
}

//Write a Java program to count vowels, consonants, digits, and special
//characters in a given string.
package lab8;
public class p3{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s = "Hello123@#";
        int v = 0, c = 0, d = 0, sp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                v++;
            else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                c++;
            else if (ch>='0'&&ch<='9')
                d++;
            else
                sp++;
        }
        System.out.println("Vowels=" + v);
        System.out.println("Consonants=" + c);
        System.out.println("Digits=" + d);
        System.out.println("Special=" + sp);
    }
}
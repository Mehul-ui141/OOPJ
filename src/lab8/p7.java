//Write a Java program to remove duplicate characters from a string while
//maintaining insertion order.
package lab8;
public class p7 {
    static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s = "Java is cool";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch)==-1)
                result = result + ch;
        }
        System.out.println("After removing duplicates: " + result);
    }
}
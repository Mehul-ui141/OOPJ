//Write a Java program to count the number of words in a sentence without
//using the split() method.
package lab8;
public class p6{
    public static void main(String[] args){
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s = "Java is cool";
        int count = 1;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ')
                count++;
        }
        System.out.println("Words = " + count);
    }
}
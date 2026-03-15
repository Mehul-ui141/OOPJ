//Write a Java program to create strings using literal and new keyword and
//compare them using == and .equals() methods.
package lab8;
public class p1{
    public static void main(String[] args) {
        System.out.println("Mehul Jha");
        System.out.println("2405287");
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Tendulkar");
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
    }
}
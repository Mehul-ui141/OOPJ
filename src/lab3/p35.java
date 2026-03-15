// Write a Java program that accepts multiple numbers via
// command line arguments and prints only prime numbers.
package lab3;
import java.util.*;
public class p35{
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++) {
            int num=Integer.parseInt(args[i]);
            if (isPrime(num)) {
                System.out.println("Prime no: " + num);
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
    static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        for (int i=2;i<=n/2;i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
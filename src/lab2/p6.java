//6.Write a Java program to find all pairs of elements
// whose sum equals a given target
package lab2;
import java.util.Scanner;
public class p6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target Sum:");
        int k=sc.nextInt();
        System.out.println("Pairs having sum are:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==k){
                    System.out.println("("+a[i]+","+a[j]+")");
                }
            }
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
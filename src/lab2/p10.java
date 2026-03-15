//Write a Java program to find the longest increasing subsequence (LIS) (basic LIS logic allowed).
package lab2;
import java.util.Scanner;
public class p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int[] list=new int[n];
        for (int i=0;i<n;i++) {
            list[i]=1;
        }
        int maxlen=1;
        for (int i=1;i<n;i++) {
            for (int j=0;j<i;j++) {
                if (a[j]<a[i] && list[j]+1>list[i]) {
                    list[i]=list[j]+1;
                }
            }
            if (list[i]>maxlen) {
                maxlen=list[i];
            }
        }
        System.out.println("length of LIS is: " + maxlen);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

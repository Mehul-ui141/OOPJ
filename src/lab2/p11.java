//Write a Java program to find the maximum sum subarray using Kadane’s algorithm.
package lab2;
import java.util.Scanner;
public class p11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int currSum = 0;
        int maxSum=a[0];
        for (int i=0;i<n;i++) {
            currSum=currSum+a[i];
            if (currSum>maxSum) {
                maxSum = currSum;
            }
            if (currSum<0) {
                currSum=0;
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
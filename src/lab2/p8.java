//8. Write a Java program to sort an array using Bubble Sort and print each pass.
package lab2;
import java.util.Scanner;
public class p8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for (int p=0;p<n-1;p++){
            for (int i=0;i<n-1-p;i++) {
                if (arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]=arr[i + 1];
                    arr[i+1] = temp;
                }
            }
            System.out.print("After p " + (p + 1) + ": ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
//Write a Java program to input an array and shift all zeroes to the end
// while maintaining order of non-zero elements.
package lab2;
import java.util.Scanner;
public class p20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array elements:");
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int index=0;
        for (int i=0;i<n;i++) {
            if (a[i]!=0) {
                a[index]=a[i];
                index++;
            }
        }
        while (index<n) {
            a[index]=0;
            index++;
        }
        System.out.println("Array after shifting zeroes to the end:");
        for (int i=0;i<n;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nMehul Jha");
        System.out.println("2405287");
    }
}
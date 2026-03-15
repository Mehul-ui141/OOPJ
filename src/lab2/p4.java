//4. Write a Java program to merge two sorted arrays into a new sorted array
// (without using built-in sort).
package lab2;
import java.util.Scanner;
public class p4{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Enter the number of elements: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        int[] merge = new int[n1+n2];
        for(int i=0; i<n1; i++){
            merge[i] = a1[i];
        }
        for (int j=0; j<n2; j++){
            merge[n1+j] = a2[j];
        }
        for (int i=0; i<(n1+n2)-1; i++){
            for (int j=0; j<(n1+n2)-i-1; j++){
                if (merge[j+1] < merge[j]){
                    int temp = merge[j];
                    merge[j] = merge[j+1];
                    merge[j+1] = temp;
                }
            }
        }
        for (int i=0 ; i<(n1+n2); i++){
            System.out.print(merge[i] + " ");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
//Write a Java program to separate even and odd numbers into two different arrays.
package lab2;
import java.util.Scanner;
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];
        int e = 0, o = 0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even[e] = arr[i];
                e++;
            } else {
                odd[o] = arr[i];
                o++;
            }
        }
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println("\nMehul Jha");
        System.out.println("2405287");
    }
}
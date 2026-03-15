//7. Write a Java program to check whether two arrays are equal (same elements in same order)
package lab2;
import java.util.Scanner;
public class p7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the array 1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the array 2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (n1 == n2){
            for (int i=0; i<n1; i++){
                if (arr1[i] == arr2[i]);
            }
            System.out.println("Array are same!");
        }
        else{
            System.out.println("Array are not same!");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}


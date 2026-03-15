//1. Write a Java program to find the second-larg element in an integer array
// without sorting
package lab2;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int larg, slarg;
        if (arr[0] > arr[1]) {
            larg = arr[0];
            slarg = arr[1];
        }
        else{
            larg=arr[1];
            slarg=arr[0];
        }
        for(int i=2;i<n;i++) {
            if (arr[i]>larg) {
                slarg=larg;
                larg = arr[i];
            }
            else if(arr[i]>slarg && arr[i]!=larg) {
                slarg=arr[i];
            }
        }
        System.out.println("Second largest element: " + slarg);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
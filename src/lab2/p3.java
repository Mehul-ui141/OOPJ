//3.Write a Java program to rotate an array by K positions to the right (user inputs K)
package lab2;

import java.util.Scanner;

public class p3{
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Position of k:");
        int k=sc.nextInt();
        k=k%n;
        for(int r=0;r<k;r++){
            int last=a[n-1];
            for(int i=n-1;i>0;i--){
                a[i]=a[i-1];
            }
        a[0]=last;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

//2.Write a Java program to remove duplicate elements from an array and print
//  the new array size.
package lab2;
import java.util.Scanner;
public class p2{
    static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    for(int k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("The size of new array" + " " + n);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
//Write a Java program to sort each row of a 2D matrix individually.
package lab2;
import java.util.Scanner;
public class p19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter the elements of the mat:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r;i++) {
            for (int j=0;j<c-1;j++) {
                for (int k=0;k<c-j-1;k++) {
                    if (mat[i][k]>mat[i][k+1]) {
                        int temp=mat[i][k];
                        mat[i][k] = mat[i][k + 1];
                        mat[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Matrix after sorting:");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
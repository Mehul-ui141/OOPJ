//Write a Java program to multiply two matrices (check dimension validity).
package lab2;
import java.util.Scanner;
public class p14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows of matrix 1: ");
        int r1=sc.nextInt();
        System.out.print("Enter columns of matrix 1: ");
        int c1=sc.nextInt();
        int[][] mat1=new int[r1][c1];
        System.out.print("Enter rows of matrix 2: ");
        int r2=sc.nextInt();
        System.out.print("Enter columns of matrix 2: ");
        int c2=sc.nextInt();
        int[][] mat2=new int[r2][c2];
        if (c1 != r2) {
            System.out.println("Not possible.");
            return;
        }
        System.out.println("Enter elements of matrix 1:");
        for (int i=0;i<r1;i++) {
            for (int j=0;j<c1;j++) {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2:");
        for (int i=0;i<r2;i++) {
            for (int j=0;j<c2;j++) {
                mat2[i][j]=sc.nextInt();
            }
        }
        int[][] multi=new int[r1][c2];
        for (int i=0;i<r1;i++) {
            for (int j=0;j<c2;j++) {
                multi[i][j]=0;
                for (int k=0;k<c1;k++) {
                    multi[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("Final matrix:");
        for(int i=0;i<r1;i++) {
            for (int j=0;j<c2;j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
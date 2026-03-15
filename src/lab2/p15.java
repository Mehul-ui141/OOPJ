//Write a Java program to find the row with the maximum sum in a 2D matrix.
package lab2;
import java.util.Scanner;
public class p15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter the matrix elements:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        int maxSum=0;
        for (int j=0;j<c;j++) {
            maxSum+=mat[0][j];
        }
        int maxRow=0;
        for (int i=1;i<r;i++) {
            int rowSum=0;
            for (int j=0;j<c;j++) {
                rowSum+=mat[i][j];
            }
            if (rowSum>maxSum) {
                maxSum=rowSum;
                maxRow=i;
            }
        }
        System.out.println("Row with maximum sum is Row " + (maxRow + 1));
        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
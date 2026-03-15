//Write a Java program to print the boundary elements of a 2D matrix.
package lab2;
import java.util.Scanner;
public class p17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] matrix =new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The boundary elements of the matrix are:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                if (i==0 || i==r-1 || j==0 || j==c-1) {
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
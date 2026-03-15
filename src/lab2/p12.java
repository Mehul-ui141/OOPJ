// Write a Java program to input a 2D matrix and check whether it is a sparse matrix.
package lab2;
import java.util.Scanner;
public class p12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter the matrix elements:");
        int count=0;
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                mat[i][j]=sc.nextInt();
                if (mat[i][j] == 0) {
                    count++;
                }
            }
        }
        int total=r*c;
        if(count>total/2) {
            System.out.println("Sparse Matrix.");
        }
        else{
            System.out.println("Not a Sparse Matrix.");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
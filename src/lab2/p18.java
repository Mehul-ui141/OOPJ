//Write a Java program to find the transpose of a matrix without using an
// extra array (in-place transpose).
package lab2;
import java.util.Scanner;
public class p18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        if (r!=c){
            System.out.println("In-place transpose NOT possible! Matrix must be square.");
            return;
        }
        int[][] mat=new int[r][c];
        System.out.println("Enter the matrix elements:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r;i++) {
            for (int j=i+1;j<c;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        System.out.println("Transpose of Matrix:");
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}

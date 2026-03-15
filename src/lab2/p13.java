//Write a Java program to add two 2D matrices of user-given size.
package lab2;
import java.util.Scanner;
public class p13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r1=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c1=sc.nextInt();
        int[][] mat1=new int[r1][c1];
        System.out.print("Enter number of rows: ");
        int r2=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c2=sc.nextInt();
        int[][] mat2=new int[r2][c2];
        if (r1!=r2 || c1!=c2){
            System.out.println("addition not possible.");
            return;
        }
        System.out.println("Enter elements of matrix 1:");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2:");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        int[][] sum=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Matrix after addition:");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
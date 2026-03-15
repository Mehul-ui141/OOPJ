//Write a Java program to check whether a 2D matrix is symmetric.
package lab2;
import java.util.Scanner;
public class p16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        if (rows != cols) {
            System.out.println("The matrix is not symmetric as it is not square.");
            sc.close();
            return;
        }
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean isSymmetric = true;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }
        if (isSymmetric){
            System.out.println("The matrix is symmetric.");
        }
        else {
            System.out.println("The matrix is not symmetric.");
        }
        System.out.println("Mehul Jha");
        System.out.println("2405287");
    }
}
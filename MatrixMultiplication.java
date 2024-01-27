import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix 1: ");
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the number of rows and columns of matrix 2: ");
        int rows2 = input.nextInt();
        int cols2 = input.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Result:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

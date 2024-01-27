import java.util.*;

public class IrregularArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        int[][] array = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = input.nextInt();
            array[i] = new int[cols];
            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Array:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

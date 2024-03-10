import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = input.nextInt();
        int[] sourceArray = new int[size];
        int[] targetArray = new int[size];
        System.out.println("Enter the elements of the source array:");
        for (int i = 0; i < size; i++) {
            sourceArray[i] = input.nextInt();
        }
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("Source array:");
        for (int element : sourceArray) {
            System.out.print(element + " ");
        }
        System.out.println("\nTarget array:");
        for (int element : targetArray) {
            System.out.print(element + " ");
        }
        input.close();
    }
}

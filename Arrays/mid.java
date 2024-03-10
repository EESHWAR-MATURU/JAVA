import java.util.Scanner;

public class mid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mid = n / 2;
        // sort the first half in asscending order
        for (int i = 0; i < mid - 1; i++) {
            for (int j = 0; j < mid - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = mid; i < n - 1; i++) {
            for (int j = mid; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
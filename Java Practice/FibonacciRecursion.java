import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibRecursion(i) + " ");
        }
    }

    static int fibRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}

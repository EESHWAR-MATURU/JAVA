import java.util.Scanner;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int j = 2; j * j <= n; j++) {
            if (isPrime[j]) {
                for (int i = j * j; i <= n; i += j) {
                    isPrime[i] = false;
                }
            }
        }
        for (int j = 2; j <= n; j++) {
            if (isPrime[j]) {
                System.out.print(j + " ");
            }
        }
    }
}

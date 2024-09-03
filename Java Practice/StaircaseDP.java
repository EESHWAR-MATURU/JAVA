import java.util.Scanner;

public class StaircaseDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Number of ways: " + n);
            return;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to stay at the ground (0 steps)
        dp[1] = 1; // 1 way to reach the first step

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("Number of ways: " + dp[n]);
    }
}

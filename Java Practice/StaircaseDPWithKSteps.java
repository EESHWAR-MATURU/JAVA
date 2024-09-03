import java.util.Scanner;

public class StaircaseDPWithKSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = sc.nextInt();

        System.out.print("Enter the maximum steps you can take at a time (k): ");
        int k = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of ways: 0");
            return;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to stay at the ground (0 steps)

        for (int i = 1; i <= n; i++) {
            dp[i] = 0;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    dp[i] += dp[i - j];
                }
            }
        }

        System.out.println("Number of ways: " + dp[n]);
        
    }
}

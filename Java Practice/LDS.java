import java.util.*;

class LDS {
    static int LIS(int[] A, int n, int[] dp) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            res = Math.max(res, dp[k]);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        int res = LIS(a, n, dp);
        System.out.println(res);
    }
}
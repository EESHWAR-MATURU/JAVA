import java.util.*;
public class hello {
    public static void main(String[] args) {
        int temp = 1, num = 5, count = 0;

        for (int i = 0; i <= num; i++) {
            for (int j = num; j <= 3 * num; j += 2) {
                for (int k = 1; k <= j; k += 3) {
                    int s = i + j + k;
                    if (s % 2 == 0)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
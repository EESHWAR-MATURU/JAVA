import java.util.*;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int h = sc.nextInt();
        int so = sc.nextInt();
        int sum = m+s+e+h+so;
        int per = sum/5;
        System.out.println(per+"%");
        sc.close();
    }
}

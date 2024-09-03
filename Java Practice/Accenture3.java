// Cubic sum:Problem statement You are given a function:Int isCubicSumExist(long long int A[],int N);
// The function accepts an array‘A’of size‘N’implement the function to return the count of good integers 
// in array‘A’An integer Z is said to be good if and only if there exist two integers x and y such that x3+y3=z 
// Example Input:N:3 A:[35,9,1]Output:2 Explanation:35 is a good integer,there exist an answer with X=2,Y=3(2^3+3^3=8+27=35)
// 9 is a good integer,there exist an answer with X=1,Y=2(1^3+2^3=9)1 is not a good integer,so total 2 integers are good 
// in the given array A The custom input format for the above case 3 35 9 1(the first line represents‘N’the second line 
// represents the elements of the array‘A’)

import java.util.*;

public class Accenture3 {
    public static int sum(int z) // 35
    {
        int x = 1, y = (int) Math.cbrt(z); // x=1 y=3 // x=2 y=3
        while (x <= y) // 1<=3
        {
            int cubsum = (x * x * x) + (y * y * y); // 1+27 =28==35 // 8+27=35
            if (cubsum == z) // 35==35
            {
                return 1;
            }
            if (cubsum < z) // 28<35
            {
                x++; // 2
            } else {
                y--;
            }
        }
        return 0;
    }

    public static int cubicsum(int n, int a[]) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a1 = sum(a[i]);
            if (a1 == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(cubicsum(n, a));
    }
}

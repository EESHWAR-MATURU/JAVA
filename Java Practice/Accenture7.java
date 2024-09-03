// Maximum Product Problem statement Given two ranges (L1, R1) and (L2, R2). 
// You need to find two numbers a and b,such that l1≤a≤R1 and L2<b≤R2 and the product of a and b is maximum. 
// Input format The input consists of a single line: The line contains four space-separated integers 
// denoting L1,L2,R1,R2 respectively.
// The input will be read from the STDIN by the candidate. 
// Output format Print the maximum product of a and b.  
// The output will be matched to the candidate's output printed on the STDOUT.  
// Constraints: •-[10]^3 <L1≤R1≤ [10]^3 •-[10]^3 <L2≤R2≤ [10]^3
// Example: Input: 1 3-2 6 Output 18  
// Explanation: The ranges are (1,3) and (-2,6). So the maximum product of a,b such that 1<=a<=3 and -2<=b<=6 is (3*6)=18.

import java.util.*;
class Accenture7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L1 = sc.nextInt();
        int R1 = sc.nextInt();
        int L2 = sc.nextInt();
        int R2 = sc.nextInt();
        int product1 = L1 * L2;
        int product2 = L1 * R2;
        int product3 = R1 * L2;
        int product4 = R1 * R2;
        int maxProduct = Math.max(Math.max(product1, product2), Math.max(product3, product4));
        System.out.println(maxProduct);
    }
}
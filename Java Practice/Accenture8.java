// Number of cards Problem statement Arrangement of cards used for building pyramids are shown in the following 
// image a pyramid return the number of cards %1000007. The function accepts an integer 'n' as its argument. 
// The integer 'n'denotes level of Pyramid. You are required
// to calculate the number of cards,required to build a pyramid return the number of cards%1000007.
// Note: •Return -1, if 'n' =0 Assumptions: •The number of cards required to build a pyramid of level 1 are 
// Input:n:2 Output: 7

import java.util.*;
class Accenture8 {
    public static int numberOfCards(int n) {
        long totalCards = 0;
        int MOD = 1000007;
        for (int i = 1; i <= n; i++) {
            totalCards = (totalCards + (3 * i - 1)) % MOD;
        }
        return (int) totalCards;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfCards(n));
    }
}

// import java.util.*;

// class Main {
//     public static int cardpy(int n) {
//         if (n > 0)
//             return n * (3 * n + 1) / 2;
//         else
//             return -1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.print(cardpy(n));
//         sc.close();
//     }
// }
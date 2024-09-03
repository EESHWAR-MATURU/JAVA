import java.util.*;

public class KMP {
    public static void LPS(String p, int l2, int[] lps) {
        int i = 0, j = 1;
        lps[0] = 0;
        while (j < l2) {
            if (p.charAt(i) == p.charAt(j)) {
                lps[j] = i + 1;
                i++;
                j++;
            } 
            else {
                if (i != 0) {
                    i = lps[i - 1];
                } else {
                    lps[j] = 0;
                    j++;
                }
            }
        }
    }

    // public static void kmp(String s, String p, int l1, int l2, int[] lps) {
    //     int i = 0, j = 0;
    //     while ((l1 - i) >= (l2 - j)) {
    //         if (s.charAt(i) == p.charAt(j)) {
    //             i++;
    //             j++;
    //         }
    //         if (j == l2) {
    //             System.out.println("Found pattern at index " + (i - j));
    //             j = lps[j - 1];
    //         } else if (i < l1 && s.charAt(i) != p.charAt(j)) {
    //             if (j != 0) {
    //                 j = lps[j - 1];
    //             } else {
    //                 i = i + 1;
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.next();
        int l1 = s.length();
        int l2 = p.length();
        int[] lps = new int[l2];
        LPS(p, l2, lps);
        // kmp(s, p, l1, l2, lps);
        // // for(int i=0;i<l2;i++){
        // // System.out.print(lps[i]+" ");
        // // }
    }
}

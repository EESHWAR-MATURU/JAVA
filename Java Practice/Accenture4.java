// Problem statement:
// Implement the following function:
// Int PlayList(int airtime, int songs[], int n);
// The function accepts a positive integer ‘airTime’ and a positive integer array ‘songs’ of size ‘n’ as its argument. 
// ‘songs’ consists of length of songs (in minutes). A radio jockey has to playlists of combination of exactly thre songs 
// such that the total length of playlists is equal to ‘airtime’ (in minutes). Implement the function to find the count of 
// playlist that can be find and return the same.
// Explanation:
// Playlists formed are
// {14,21,5} = 14 + 21+ 5 = 40
// {7,14,19} = 7 + 14 + 19 = 40
// {21,17,2} = 21 + 17 + 2 = 40
// Since, 3 playlists can be formed thus, output is 3
// The custom input format for the above case:
// 40
// 8
// 7 14 21 19 17 2 29 5
// (the first line represents ‘airTime’ the second line represents the size of ‘songs’,
// The third line represents the element of ‘songs’)
// Sample Input:
// airTime: 21
// songs : 10 7 9 5 2
// Sample output:
// 2
// The custom input for the above case:
// Explanation:
// Playlists formed are
// {14,21,5} = 14 + 21+ 5 = 40
// {7,14,19} = 7 + 14 + 19 = 40
// {21,17,2} = 21 + 17 + 2 = 40
// Since, 3 playlists can be formed thus, output is 3
// The custom input format for the above case:
// 40
// 8
// 7 14 21 19 17 2 29 5
// (the first line represents ‘airTime’ the second line represents the size of ‘songs’,
// The third line represents the element of ‘songs’)
// Sample Input:
// airTime: 21
// songs : 10 7 9 5 2
// Sample output:
// 2
// The custom input for the above case:
// 21
// 5
// 10 7 9 5 2
// (the first line represents ‘airTime’ the second line represents the size of ‘songs’,
// The third line represents the element of ‘songs’)
// Instructions:
// This is a template based question,DO NOT write the “main” function
// Your code is judged by an automated system,do not write any additional welcome /greeting messages
// “Save and Test” only checks for basic test cases, more rigorous cases will be used to judge your code while scanning
// Additional score will be given for writing optimized code both in terms of memory and execution time


import java.util.*;

public class Accenture4 {
    public static void playlist(int air, int a[], int n) {
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> s = new HashSet<Integer>();
            int cur = air - a[i];
            for (int j = i + 1; j < n; j++) {
                if (s.contains(cur - a[j])) {
                    count++;
                }
                s.add(a[j]);
            }
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int air = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        playlist(air, a, n);
    }
}

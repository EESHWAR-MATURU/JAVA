// Problem statement A palindrome is a sequence of characters that has the property of reading the same in either direction. 
// You are given a function, char ConvertToPalindrome(char*str); The function accepts a string 'str'. 
// Implement the function to find and return the minimum characters required to append at the end of string 'str' to make it palindrome.
// Example: Input: abcdc Output: ba Explanation: If we append 'ba' at the end of the string 'abcdc' 
// it becomes 'abcdcba'(i.e A palindrome string)


// You’re given a function,
// char*ConvertToPalindrome(char*str)
// The function accepts a string str,implement the function to find and return the minimum 
// characters required to append at the end of str to make it a palindrome
// Assumptions–
// The string will only contain lowercase English Alphabets
// Note–
// If string is already a palindrome then return NULL 
// You have to find the minimum characters required to append at the end of the string to make it a palindrome Example–
// Input–
// abcdc
// Output–
// ba

import java.util.*;

public class Accenture2 {
    static char[] ConvertToPalindrome(String str){
        int n = str.length();
        int i = 0, j = n - 1;
        int count = 0;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                i++;
                count++;
            }
            j--;
        }
        StringBuffer res = new StringBuffer(str.substring(0, count));
        String s = res.toString();
        char ans[] = s.toCharArray();
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //next()
        char a[] = ConvertToPalindrome(str);
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i]);
        }
    }
}

// import java.util.Scanner;

// public class Accenture2 {

//     static int ConvertToPalindrome(String str) {
//         int n = str.length();

//         // Check for the minimum suffix that makes the string a palindrome
//         for (int i = 0; i < n; i++) {
//             if (isPalindrome(str.substring(i))) {
//                 return i; // Number of characters to add
//             }
//         }
//         return n - 1; // If no palindrome is found (worst case)
//     }

//     // Helper method to check if a string is a palindrome
//     static boolean isPalindrome(String str) {
//         int i = 0, j = str.length() - 1;
//         while (i < j) {
//             if (str.charAt(i) != str.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         System.out.println(ConvertToPalindrome(str));
//     }
// }
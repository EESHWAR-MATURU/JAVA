// Find the word average Problem Statement F Implement the following function: Static float Average (String str){} 
// The function accepts a string 'str' of length 'len' as its arugment. R Implement the function to calculate the word 
// average and return the same. Word Average is calculated by finding the average of the ASCII values of all of the letters in a word.
// Note:'str' is not null F • Input string will contain only lower case English alphabets 
//  • The ASCII value of lower case 'a' is 97 while that of 'z' is 122 • Do not round off your results, 
//  it will be automatically rounded off up to 2 decimal places and then displayed Example: Input : RG Str: source
// r 114 76 C 99 77 e 101 Word Average =(115+111+117+114+99+101)/6=657/6=109.50 79 Thus Output is 109.50 
// The custom input format for the above case : source 
// (The first line represent the string 'str')

import java.util.*;
class Accenture5 {
    static float Average(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (int) str.charAt(i);
        }
        return (float) sum / str.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("%.2f",Average(str));
    }
}
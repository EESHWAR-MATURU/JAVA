// DigiOdd X Share Find A Arrange Replace 00 Add-ins Faragraph Drawing Select Editing Add-ins 
// Problem statement You are provided with a number N. Count and print the number of integers x 
// that follow the following conditions  • 1 ≤ x ≤ N •X has odd number of digits Side of 
// Input format The input consists of a single line I The line contains a single integer denoting N.


import java.util.*;
class Accenture9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int x = 1; x <= N; x++) {
            int numDigits = (int) Math.log10(x) + 1;
            if (numDigits % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
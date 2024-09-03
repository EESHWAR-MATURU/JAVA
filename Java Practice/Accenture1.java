// The Binary number system only uses two digits, 0 and 1 and the number system can be called binary string. You are required to implement the following function:
// int OperationsBinaryString(char* str);
// The function accepts a string str as its argument. The string str consists of binary digits separated with an alphabet as follows:
// – A denotes AND operation
// – B denotes OR operation
// – C denotes XOR Operation
// You are required to calculate the result of the string str, scanning the string to right taking one operation at a time, and return the same.
// Note: No order of priorities of operations is required.
// Length of str is odd.
// If str is NULL or None (in case of Python), return -1.
// Input:
// 1C0C1C1A0B1
// Output:
// 1
// Explanation:
// The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, the result of the expression becomes 1, hence 1 is returned.

import java.util.Scanner;

class Accenture1 {

    static int OperationsBinaryString(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        int result = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i += 2) {
            char op = str.charAt(i);
            int num = str.charAt(i + 1) - '0';

            if (op == 'A') {
                result = result & num;
            } else if (op == 'B') {
                result = result | num;
            } else if (op == 'C') {
                result = result ^ num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //.nextLine()
        System.out.println(OperationsBinaryString(str));
    }
}

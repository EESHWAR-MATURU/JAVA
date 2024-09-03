// Maximum element and its index Problem Statement You are given a function Void MaxInArray(int arr[], int length): 
// The function accepts an integer array 'arr' of size 'length' as its argument. Implement the function to find 
// the maximum element of the array and print the maximum element and its index to the standard output (STDOUT). 
// The maximum element and its index should be printed in separate lines.
// Note: R 117 • Array index starts with 0. 118 • Maximum element and 
// its index should be separated by a line in the output. 119 120 
// • Assume there is only 1 maximum element in the array. • Print exactly what is asked, 
// do not print any additional greeting messages
// Example: Input: 10 23 45 82 27 66 12 78 137 186 
// Output: 86 9
// Explanation: 86 is the maximum element of the array ai index 9.

import java.util.*;
class Accenture6 {
    static void MaxInArray(int arr[], int length) {
        int maxElement = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxElement);
        System.out.println(maxIndex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        MaxInArray(arr, length);
    }
}

// import java.util.*;

// class Main {
//     public static void maxvalueindex(int arr[], int n) {
//         int maxvalue = -999999;
//         int index = -1;
//         for (int i = 0; i < n; i++) {
//             if (maxvalue < arr[i]) {
//                 maxvalue = arr[i];
//                 index = i;
//             }
//         }
//         System.out.print(maxvalue + "\n" + index);

//     }

//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++)
//         arr[i]=sc.nextInt();
//         maxvalueindex(arr,n);
//     }
// }
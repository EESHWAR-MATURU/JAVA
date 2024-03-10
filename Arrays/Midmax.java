
import java.util.Scanner;
import java.util.Arrays;

public class Midmax {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n; i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Original array" +Arrays.toString(arr));
//sort the Arrays
Arrays.sort(arr);
int[] result =new int[n];
int start =0,end=n-1;
for(int i=0; i<n; i++)
{
if(i%2==0)
{
result[i]=arr[end];
end--;
}
else{
result[i]=arr[start];
start++;
}
}
System.out.println("Rearranged array is "+Arrays.toString(result));  }
}
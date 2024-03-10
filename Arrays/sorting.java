import java.util.Scanner;

public class sorting {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n; i++)
{ arr[i]=sc.nextInt(); // 2 3 4 5 1
}
for(int i=0; i<n; i++)
{
for (int j=i+1; j<n; j++)
{
if (arr[i]<arr[j]) { //swap elements
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Descending order the aarry is ");
for(int i=0;i<n; i++)
{
System.out.println(arr[i]); //5 4 3 2 1
}}
}
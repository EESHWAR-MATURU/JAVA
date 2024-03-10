import java.util.Scanner;

public class leaders {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int sum=0;
for (int i=0;i<n-1;i++)
{
int flag=1;
for(int j=i;j<n;j++){
if(arr[j]>arr[i]){
flag=0;
break;
}}
if(flag==1)
{
sum=sum+arr[i];
}
}
sum=sum+arr[n-1];
System.out.print("The sum of the leaders are "+sum);
}
}
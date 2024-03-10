import java.util.Scanner;
public class sumandsize{
public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
int s1=sc.nextInt();
int s2=sc.nextInt();
int[] a1=new int[s1];
int[] a2=new int[s2];
int sum1=0,sum2=0;
for(int i=0;i<s1 ; i++)
{
a1[i]=sc.nextInt();
sum1=sum1+a1[i];
}
for(int i=0;i<s2;i++)
{
a2[i]=sc.nextInt();
sum2=sum2+a2[i];
}
if(s1==s2&& sum1==sum2) {
System.out.println("Same");
}
else{
System.out.println("Not Same");
}
}
}
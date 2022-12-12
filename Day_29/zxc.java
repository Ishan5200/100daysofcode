package Day_29;

import java.util.Scanner;
public class zxc
{
private Scanner in;
public zxc()
{
in = new Scanner(System.in);
}
public void run()
{
int testCases = in.nextInt();
for(int test=0; test<testCases; test++)
{
int n = in.nextInt();
int[] arr = new int[n];
int[] dp = new int[n];
for(int i=0; i<n; i++)
arr[i] = in.nextInt();
int max = arr[n-1];
for(int i=n-1; i>=0; i--)
{
max = (arr[i]>max)?arr[i]:max;
dp[i] = max;
}
long sum = 0;
for(int i=0; i<n; i++)
{
sum += (dp[i] - arr[i]);
}
System.out.println(sum);
}
}
public static void main(String[] args)
{
zxc solution = new zxc();
solution.run();
}
}



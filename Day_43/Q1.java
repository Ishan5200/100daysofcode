package Day_43;

/*Problem statement
A chocolate factory is packing chocolates into packets. The chocolate packets here represent an array arr[] of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
For example:
N = 7 and arr = [4, 5, 0, 1, 9, 0, 5, 0]
There are 3 empty packets in the given set. These 3 empty packets represented as 0 should be pushed toward the end of the array.

Example 1
Input:
7
4 5 0 1 9 0 5
Output:
4 5 1 9 5 0 0 

Example 2
Input:
6
6 0 1 8 0 2
Output:
6 1 8 2 0 0

Input format
The first line of input contains an integer n denoting the size of an array
The next space-separated integers denote the elements of an array

Output format
The output prints an integer array separated by space.*/
import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size: ");
            int n = sc.nextInt();
            System.out.println("Enter the values: ");
            int ctr = 0;
            int[] packet = new int[n];
            for(int i=0; i<n; i++){
                packet[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                if(packet[i]!=0){
                    System.out.print(packet[i]+" ");
                }
                else{
                    ctr++;
                }
            }
            for(int i=0; i<ctr; i++){
                System.out.print(0+" ");
            }
        }
    }
}
package Day_46;
/*The numerological reduction of a number is the sum of digits calculated recursively until the resulting value is a single digit.
You are given a function,
int FindNumerologicalReduction(int n);
The function accepts a positive integer ‘n’. Implement the function to find and return the numerological reduction of ‘n’.
Assumption
n > 0
Example
Input
3245
Output
5
Explanation
3245 = 3 + 2 + 4 + 5 = 14
14 = 1 + 4 = 5
Hence 5 is the numerological reduction of 3245
Input format
Contains a single integer
Output format
The Sum of digits reduced up to single-digit*/
import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer: ");
            int n = sc.nextInt();
            System.out.println("Sum of digits reduced up to single-digit: ");
            System.out.println(digitSum(n));
        }
    }
    static int digitSum(int n){
        int sum = 0;
        while(n>0 || sum>9){
            if(n==0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
}

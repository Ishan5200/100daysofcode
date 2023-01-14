package Day_53;

/*Problem Statement:
Write a program to Convert a Decimal Number to Binary and Count the number of 1s.

Input format:
The input consists of a number.

Output format:
The output prints the number of 1’s in a binary format.

Example:
Input: 11
Output: Number of 1s is : 3*/
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            String b = Integer.toBinaryString(n);
            char [] ch = b.toCharArray();
            int ctr = 0;
            for (int i = 0; i < b.length(); i++) {
                if (ch[i] == '1')
                    ctr++;}
            System.out.println("Number of 1s is : "+ctr);
        }
    }
}

/*Write a program to find the number of occurrences of a character in a string.

Input format: Input to get a string in the first line and a character in the second line.

Output format: Output the number of occurrences of a character in a string.

Input: utter t

Output: 2*/

import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        char [] ch = s.toCharArray();
        System.out.println("Enter a character");
        char c = sc.next().charAt(0);
        int ctr = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (ch[i] == c)
                ctr++;
        }
        System.out.println("Number of occurrences of '"+c+"' in the string: "+ctr);
    }
}


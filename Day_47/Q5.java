package Day_47;

/*Problem statement:
A private bank has a problem with its credit card processing system. As a result, the majority of customers have contacted the bank about the payment problem. Now the bank has to check whether the credit number is valid or not before proceeding with the further clearance process. Write a program to obtain a credit card number and check its validity. Card numbers should start with 4 for Visa cards, 5 for Master cards, 37 for American Express cards, and 6 for Discover cards.

Conditions for a card to be valid:
Consider the card number: 4388576018402626

Step 1: Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number (like for 12: 1 + 2, 18: 1 + 8).

Step 2: Add all of the single-digit numbers from Step 1. (4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37)

Step 3: Add all the digits in the odd places from right to left in the card number. (6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38)

Step 4: Sum the results from Steps 2 and 3. (37 + 38 = 75)

Step 5: If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. 

Input format
The input consists of the credit card number.
Output format
The output prints whether the number is valid or not.

Example:
Input 
379354508162306
Output 
379354508162306 is valid*/

import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter credit card number: ");
            long cn = sc.nextLong();
            long temp = cn;
            long temp2 = cn;
            long doubleDigit = 0, last2Digit = 0, lastDigit = 0, sum1 = 0;
            while(cn>0) {
                last2Digit = cn % 100;
                lastDigit = last2Digit / 10;
                doubleDigit = lastDigit * 2;
                if(doubleDigit>9) {
                    long inner_first = doubleDigit % 10;
                    long inner_second = doubleDigit / 10;
                    doubleDigit = inner_first + inner_second; }
                sum1 = sum1 + doubleDigit;
                cn/=100; }
            long odd_digit = 0, sum2 = 0;
            while(temp>0) {
                odd_digit = temp % 10;
                temp = temp / 100;
                sum2 += odd_digit; }
            long finalSum = sum1 + sum2;
            if(finalSum % 10 == 0)
                System.out.println(temp2+" is valid");
            else
                System.out.print(temp2+" is invalid");
        }
    }
}
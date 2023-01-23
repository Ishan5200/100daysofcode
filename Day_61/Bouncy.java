/*

Problem Statement:
Write a program to check whether a number is Bouncy number or not.

Bouncy number: A positive integer that is neither increasing nor decreasing number is called a bouncy number.
In other words, A number whose digits are unsorted.

Increasing number:
In an integer traversing from left to right if the current digit is greater than or equal to the previous digit, the number is known as increasing number.
Example: 2368

Decreasing number:
In an integer traversing from left to right if the current digit is less than  the previous digit, the number is known as decreasing number.
Example: 9854

Example of Bouncy Number: 13174, 101, 15296  etc.
Note: There is no Bouncy number between 1 to 100.

*/





import java.util.Scanner;
public class Bouncy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int p,a=0,b=0,d,sd;
        p = n;
        if (n<100){
            System.out.println(p+" is not a Bouncy number"); }
        else {
            while (n>0){
                d = n%10;
                sd = (n%100)/10;
                n=n/10;
                if (d>sd && b==0) {
                    a = 1;
                    continue; }
                else if (d<sd && a==0){
                    b=1;
                    continue;
                }else {
                    b=2;
                    break; } }
            if (b==2)
                System.out.println(p+" is a Bouncy Number");
            else System.out.println(p+" is not a Bouncy Number"); } }}









/*Problem Statement:
Write a program to calculate norm of a number.

Norm of a number is square root of sum of squares of all digits of the number.

Example
68
6x6+8x8 = 100; Square root of 100 = 10

Norm of 68 is 10*/

import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int p,dig,s=0;
        p = n;
        while (p>0){
            dig = p % 10;
            s = s+(dig*dig);
            p = p/10;
        }
        System.out.println("Norm of "+n+" is "+Math.sqrt(s));
    }
}





package Day_45;

/*Problem Statement
Vijay is working in a software company and he is preparing a document about his project. As per requirement, the first letter in each word should be in the upper case. But Vijay typed the entire document in lower case. Help Vijay to capitalize the first letter in each word.

Input format
The input consists of a string.
Output format
The output prints the string with first letter in upper case.

Example
Input
a quick brown fox jumps over the lazy dog
Output
A Quick Brown Fox Jumps Over The Lazy Dog*/ 
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = sc.nextLine();
            String[] words = str.split(" ");
            System.out.println("Output: ");
            for(String word: words){
                System.out.print(word.substring(0,1).toUpperCase());
                System.out.print(word.substring(1,word.length()));
                System.out.print(" ");
            }
        }
    }
}

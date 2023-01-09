package Day_44;
/*Problem Statement:
Write a program that accepts a hyphen-separated sequence of words as input and prints the words in a hyphen-separated sequence after sorting them alphabetically.
 
Sample Items: green-red-yellow-black-white
Expected Result: black-green-red-white-yellow

Input format:
The input consists of a string separated by a hyphen.
Output format:
The output prints the sorted string.*/
import java.util.Scanner;
public class Q2{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string separated by a hyphen: ");
            String str = sc.nextLine();
            String[] words = str.split("-");
            for(int i=0;i<words.length;i++)
            {
                for(int j=i+1; j<words.length; j++)
                {
                    if(words[i].compareTo(words[j])>0)
                    {
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
            for(int i=0;i<words.length;i++){
                if(i == words.length-1)
                    System.out.print(words[i]);
                else
                    System.out.print(words[i]+"-");
            }
        }
    }
}

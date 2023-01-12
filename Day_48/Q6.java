package Day_48;


import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount");
            int n = sc.nextInt();
            int c =0;
            while(n>100){
                int t = n / 100;
                c = c + t;
                n = n - (t*100); }
            while(n>=50){
                int t = n / 50;
                c = c + t;
                n = n - (t*50); }
            while(n>=10){
                int t = n / 10;
                c = c + t;
                n = n - (t*10); }
            while(n>=5){
                int t = n /5;
                c = c+t;
                n=n-(t*5); }
            while(n>=2){
                int t = n / 2;
                c = c+t;
                n= n-(t*2); }
            while(n>=1){
                int t = n;
                c = c+t;
                n= n-(t); }
            System.out.print("The smallest number of notes that will combine to give "+n+" amount: "+c);
        }
    }
}




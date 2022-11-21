package Day_16;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + ", ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}

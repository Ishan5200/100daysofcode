package Day_26;

import java.util.Scanner;
import java.util.InputMismatchException;

public class handling {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            try {
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(x/y);
            } catch (InputMismatchException e) {
                System.out.println(e.getClass().getName());
            } catch (ArithmeticException e) {
                System.out.println(e.getClass().getName() + ": / by zero");
            }
        }
    }
} 

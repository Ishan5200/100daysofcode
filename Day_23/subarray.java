package Day_23;

import java.util.*;

public class subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int c1 = 0;
        for(int i = 0; i < arr.length; i++) {
            int c2 = 0;
            for(int j = i; j < arr.length; j++) {
                c2 += arr[j];
                if(c2 < 0) {
                    c1++;
                }
            }
        }
        System.out.println(c1);
    }
}
    


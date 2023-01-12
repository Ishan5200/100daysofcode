package Day_42;

import java.util.*;

public class Solution {
static ArrayList<ArrayList<Integer>>al=new ArrayList<ArrayList<Integer>>(); 
    public static void main(String[] args) {
        try (/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                ArrayList<Integer> al2 = new ArrayList<Integer>();
                for (int j = 0; j < l; j++) {
                    al2.add(sc.nextInt());
                }
                al.add(al2);
            }
            int not= sc.nextInt();
            
            for (int i = 0; i < not; i++) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                try{
                    int result = al.get(n1-1).get(n2-1);
                    System.out.println(result);
                }
                catch(Exception e){
                    System.out.println("ERROR!");
                }
            }
        }
        
        
    }
}

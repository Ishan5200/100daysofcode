package Day_12;

import java.util.Scanner;

public class pattern {
    public static void drawButterflyPattern(int N) {  
        int space = 2*N-1;  
        int star = 0;  
        // use for loop   
                for(int j = 1; j <= 2*N-1; j++){  
                        if(j <= N){  
                            space = space - 2;  
                            star++;  
                        }  
                        else {  
                            space = space + 2;  
                            star--;  
                        }  
            // use for loop to print star  
                        for(int m = 1; m <= star; m++){  
                         System.out.print("*");  
                        }  
            // use for loop to print space  
                        for(int n = 1; n <= space; n++){  
                            System.out.print(" ");  
    
                        }  
                   // use for loop to print star for special case  
                                    for(int p = 1; p <= star; p++){  
                                        if(p != N){  
                                System.out.print("*");  
                            }  
                                    }  
                                    System.out.println();  
                            }  
                }  
                // main() method start  
                    public static void main(String[] args) {  
                    int N;  
                    // create Scanner class object to take input from user  
                         Scanner sc = new Scanner(System.in);  
                            System.out.println("Enter value of N");  
                    N = sc.nextInt();  
                    // close scanner class object  
                    sc.close();  
                    // call drawButterflyPattern() method   
                    drawButterflyPattern(N);  
                    }  
            }  
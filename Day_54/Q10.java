/*Enter a String and remove all the junk/special characters in that String*/
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a String: ");
            String str = sc.nextLine();
            str = str.replaceAll("[^a-zA-Z0-9]","");
            System.out.println("Output : "+str);
        }
    }
}


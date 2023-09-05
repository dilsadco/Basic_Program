// In this program count integer number
package Basic_Program;

import java.util.*;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer number : ");
        int num = sc.nextInt();
        sc.close();
        int numberOfDigit = 0;
        while (num > 0) {
            num = num / 10;
            numberOfDigit++;
        }
        System.out.println(numberOfDigit);
    }

}

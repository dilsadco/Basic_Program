package Basic_Program;

import java.util.*;
import java.math.*;

public class Biginteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger sum = A.add(B);
        BigInteger mul = A.multiply(B);
        System.out.println(sum);
        System.out.println(mul);
    }
}

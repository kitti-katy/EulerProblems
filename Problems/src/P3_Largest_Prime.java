import java.math.BigInteger;

/**
 * Created by Yekaterina on 8/11/2016.
 */
public class P3_Largest_Prime {
    public static void main(String[] args) {
        System.out.println(findTheLargestPrime(600851475143l));

    }

    static long findTheLargestPrime(long n) {
        if (checkPrime(n))
            return n;
        long largestPrime = 1;
        long factor = 2;
        long number = n;


        while (factor <= n) {
            if (n % factor == 0) {
                if (checkPrime(factor) && largestPrime < factor)
                    largestPrime = factor;
                while (n % factor == 0)
                    n = n / factor;
                factor++;
            }
            factor++;
        }
        if (largestPrime == 1)
            return number;
        return largestPrime;

    }

    static boolean checkPrime(long n) {
        long factor = 3;
        long left = n;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0)
            return false;

        while (factor <= left) {
            if (n % factor == 0)
                return false;
            left = n / factor;
            factor += 2;
        }
        return true;
    }
}

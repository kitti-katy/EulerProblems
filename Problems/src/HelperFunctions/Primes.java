package HelperFunctions;

/**
 * Created by Yekaterina on 8/12/2016.
 */
public class Primes {

    public static boolean checkPrime(long n) {
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

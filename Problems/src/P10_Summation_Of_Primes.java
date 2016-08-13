import HelperFunctions.Primes;

/**
 * Created by Yekaterina on 8/12/2016.
 */
public class P10_Summation_Of_Primes {

    public static void main(String[] args) {
        System.out.println(findSummationOfPrimes(2000000l));
    }

    static long findSummationOfPrimes(long number) {
        long sum = 0;
        for (long i = 2; i < number; i++) {
            if (Primes.checkPrime(i))
                sum = sum + i;
        }

        return sum;
    }
}

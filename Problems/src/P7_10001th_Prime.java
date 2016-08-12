/**
 * Created by Yekaterina on 8/11/2016.
 */
public class P7_10001th_Prime {
    public static void main(String[] args) {
        System.out.println(findLargestPrime(10001));
    }

    static int findLargestPrime(int n) {

        int largest = 2;
        int nth = 1;
        for (int i = 1; nth < n; i++) {
            if (checkPrime(i) && i > largest) {
                largest = i;
                nth++;
            }
        }
        return largest;
    }

    static boolean checkPrime(int n) {
        int factor = 3;
        int left = n;

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
/**
 * Created by Yekaterina on 8/13/2016.
 */
public class P12_Triangle_Number {

    public static void main(String[] args) {
        System.out.println(findTriangleNumber(500));
    }

    static long findTriangleNumber(int numberOfDivisors) {

        if (numberOfDivisors == 1)
            return 1;
        int triangle = 1;

        for (int i = 2; ; i++) {
            triangle += i;
            if (countDivisors(triangle) > numberOfDivisors)
                return triangle;

        }
    }

    static int countDivisors(int number) {
        int divisors = 0;
        int n = number;
        for (int i = 1; i < n; i++) {
            if (number % i == 0) {
                divisors += 2;
                n = number / i;
            }
        }
        return divisors;
    }
}

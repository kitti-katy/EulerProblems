/**
 * Created by Yekaterina on 8/11/2016.
 */
public class P6_Sum_Of_Squares {

    public static void main(String[] args) {
        System.out.println(difference(100));
    }

    static int difference(int n) {
        return squareOfSums(n) - sumOfSquares(n);
    }

    static int sumOfSquares(int n) {
        if (n == 1)
            return 1;
        return n * n + sumOfSquares(n - 1);
    }

    static int squareOfSums(int n) {
        return sum(n) * sum(n);
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
}

/**
 * Created by Yekaterina on 8/11/2016.
 */
public class P1_Multiples_Of_3_and_5 {
    public static void main(String[] args) {

        System.out.println(getSum());

    }

    static int getSum() {
        return getSum(3);
    }

    static int getSum(int n) {
        if (n < 1000) {
            return getSum(getMultiple(n) + 1) + getMultiple(n);
        } else
            return 0;
    }

    static int getMultiple(int n) {

        while (n % 3 != 0 && n % 5 != 0) {
            n++;
        }
        return n;
    }
}

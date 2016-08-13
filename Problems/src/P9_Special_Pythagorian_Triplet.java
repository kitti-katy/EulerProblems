import java.util.ArrayList;

/**
 * Created by Yekaterina on 8/12/2016.
 */
public class P9_Special_Pythagorian_Triplet {

    public static void main(String[] args) {
        System.out.println(findTriplet());
    }

    static int findTriplet() {


        int c = 1000;

        for (int a = 1; ; a++) {

            for (int b = a + 1; b < c; b++) {
                c = 1000 - a - b;
                if (checkTriplet(a, b, c))
                    return a * b * c;
                c--;

            }
        }
    }

    static boolean checkTriplet(int a, int b, int c) {
        if (a * a + b * b == c * c)
            return true;
        return false;
    }


}
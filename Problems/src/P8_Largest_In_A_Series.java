

/**
 * Created by Yekaterina on 8/12/2016.
 */
public class P8_Largest_In_A_Series {
    public static void main(String[] args) {
        System.out.println(findThirteenNumbers("73167176531330624919225119674426574742355349194934" + "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450"));
    }


    static long findThirteenNumbers(String number) {
        long index = findThirteenNumbersToMultiply(0, 12, number, 0)[1];
        return index;
    }

    static long[] findThirteenNumbersToMultiply(int startPoint, int endPoint, String number, long product) {
        if (endPoint >= number.length())
            return new long[]{0, 0};

        long newProduct = 1;

        if (product == 0) {

            for (int i = startPoint; i < endPoint + 1; i++) {
                if (Character.getNumericValue(number.charAt(i)) == 0)
                    return findThirteenNumbersToMultiply(i + 1, i + 13, number, 0);
                newProduct = newProduct * Character.getNumericValue(number.charAt(i));
            }

        } else {
            newProduct = (product / Character.getNumericValue(number.charAt(startPoint - 1))) * Character.getNumericValue(number.charAt(endPoint));
            if (newProduct == 0) {
                startPoint = startPoint + 12;
                endPoint = endPoint + 12;
            }
        }

        long[] finalGreatest = findThirteenNumbersToMultiply(startPoint + 1, endPoint + 1, number, newProduct);
        if (finalGreatest[1] > newProduct)
            return finalGreatest;
        return new long[]{startPoint, newProduct};

    }
}



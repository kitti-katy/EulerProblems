/**
 * Created by Yekaterina on 8/11/2016.
 */
public class P5_Smallest_Multiple {
    public static void main(String[] args) {
        System.out.println(smallestMultiple(20));
    }

    static int smallestMultiple(int n) {
        int allNumbers[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            allNumbers[i] = i;
        }
        int smallestMultiple = 1;

        for (int i = 2; i <= n; i++) {
            smallestMultiple = smallestMultiple * allNumbers[i];

            for (int j = i + 1; j < n + 1; j++) {
                if (allNumbers[j] % allNumbers[i] == 0)
                    allNumbers[j] = allNumbers[j] / allNumbers[i];
            }
        }
        return smallestMultiple;
    }
}

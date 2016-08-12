import java.util.Stack;

/**
 * Created by Yekaterina on 8/11/2016.
 */
public class P4_Largest_Palindrome {
    public static void main(String[] args) {
        System.out.println(findPalindrome());
    }

    static long findPalindrome() {
        long largestPalindrome = 0;
        for (int i = 100; i < 1000; i++)
            for (int j = i; j < 1000; j++) {
                if (checkForPalindrome((long) (i * j)) && (long) (i * j) > largestPalindrome)
                    largestPalindrome = (long) (i * j);

            }
        return largestPalindrome;
    }

    static boolean checkForPalindrome(long n) {
        String palindrome = Long.toString(n);
        String firstHalf;
        String secondHalf;
        if (palindrome.length() % 2 != 0) {
            int center = palindrome.length() / 2 + 1;
            firstHalf = palindrome.substring(0, palindrome.length() / 2);
            secondHalf = palindrome.substring(palindrome.length() / 2 + 1);
        } else {
            firstHalf = palindrome.substring(0, palindrome.length() / 2);
            secondHalf = palindrome.substring(palindrome.length() / 2);
        }


        int j = firstHalf.length() - 1;
        for (int i = 0; i < firstHalf.length(); i++) {
            if (firstHalf.charAt(i) != secondHalf.charAt(j))
                return false;
            j--;
        }
        return true;

    }
}

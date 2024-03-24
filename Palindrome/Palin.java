
/**
 * Palin
 */

package Palindrome;

public class Palin {
    public static boolean findPalin(int n) {
        int original = n;
        int reverseNum = 0;

        while (n > 0) {

            int digit = n % 10;

            reverseNum = reverseNum * 10 + digit;
            n /= 10;

        }

        return original == reverseNum;
        // System.out.println(result);

    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(findPalin(number));
    }

}
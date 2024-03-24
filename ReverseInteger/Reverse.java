package ReverseInteger;

public class Reverse {

    // public static int reverseInteger(int num) {

    // // int digit, rev;
    // // rev = 0;
    // // // original = num;

    // // if (num > 0) {
    // // while (num > 0) {
    // // digit = num % 10;
    // // rev = rev * 10 + digit;

    // // num /= 10;

    // // }
    // // }

    // // else {
    // // while (num < 0) {
    // // digit = num % 10;
    // // rev = rev * 10 + digit;

    // // num /= 10;

    // // }

    // // }
    // // return rev;

    // }

    public static int reverse1(int x) {
        int temp = x;
        long rev = 0;
        while (temp != 0) {
            // System.out.println(temp % 10);
            if (rev == 0)
                rev = temp % 10;
            else
                rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ? 0 : (int) rev;

    }

    public static void main(String[] args) {

        int num = 1539;
        // System.out.println(reverseInteger(num));
        System.out.println(reverse1(num));

    }

}

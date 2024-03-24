package isHappy;

import java.util.*;

/**
 * IsHpy
 */
public class IsHpy {
    public static boolean isHapy(int num) {
        while (num != 0) {
            int digit1 = num / 10;
            int digit2 = num % 10;

            if (Math.pow(digit1, 2) + Math.pow(digit2, 2) == 100) {

                return true;

            }
        }
        return false;

    }

    public static void main(String[] args) {

        int num = 19;
        System.out.println(isHapy(num));
    }
}
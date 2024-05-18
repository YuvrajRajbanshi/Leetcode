package Anagrams;

import java.util.Arrays;

public class Ana {

    public static boolean findAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {

            if (ch1[i] != ch2[i]) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        // "triangle" and "integral"
        // String s = "anagram";
        // String t = "nagaram";
        // "aacc"
        // t =
        // "ccac"
        String s = "aacc";
        String t = "ccba";
        System.out.println(findAnagram(s, t));
    }

}

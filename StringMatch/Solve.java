package StringMatch;

/**
 * Solve
 */
public class Solve {

    public static int strMatch(String haystack, String needle) {

        int i = 0, j = 0, k = 0;

        int len1 = haystack.length();
        int len2 = needle.length();

        while (len1 > 0) {

            char ch1 = haystack.charAt(i);

            while (len2 > 0) {
                char ch2 = needle.charAt(j);

                if (ch1 == ch2) {
                    return j;
                }
                len2--;
                j++;
            }
            len1--;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {

        String name = "Yuvrajsingh";
        String title = "singh";

        System.out.println(strMatch(name, title));
    }
}
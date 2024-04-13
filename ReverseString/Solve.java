package ReverseString;

/**
 * Solve
 */

public class Solve {

    public static void reverseString(String name) {

        String ans = " ";

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);
            ans = ch + ans;
        }

        for (int i = 0; i < name.length(); i++) {
            System.out.print(ans.charAt(i) + " ");
        }
        System.out.println(" ");
        // return ans;

        // int i = 0;
        // int j = name.length() - 1;

        // char[] newArray = name.toCharArray();
        // while (i < j) {

        // char temp = newArray[i];
        // newArray[i] = newArray[j];
        // newArray[j] = temp;

        // i++;
        // j--;

        // }

        // return new String(newArray);
    }

    public static void reverseString1(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        String name = "hello";

        char[] input1 = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(name);

        // System.out.println(reverse);

        reverseString1(input1);

    }
}
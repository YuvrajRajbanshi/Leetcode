package ReverseWord;

public class Solve {

    public static void reverseWord(String str) {

        // int left = 0;
        // int right = str.length() - 1;
        // String result = "";
        // while (left < right) {

        // if( str.charAt())

        // left++;
        // right--;
        // }

        // return "yuvraj";

        String result = "";
        for (int i = str.length() - 1; i <= 0; i++) {

            if (str.charAt(i) == ' ') {

                result += str.charAt(i);

            }

        }

        System.out.println(result);

    }

    public static void main(String[] args) {

        String str = "Hello world";

        reverseWord(str);
    }

}

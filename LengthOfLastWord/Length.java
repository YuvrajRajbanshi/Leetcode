
package LengthOfLastWord;

public class Length {

    public static int strLength(String str) {

        int count = 0;
        String result = str.trim();

        for (int i = result.length() - 1; i >= 0; i--) {

            // System.out.println(i);
            count++;
            if (result.charAt(i) == ' ') {
                return count - 1;
            }

        }
        return result.length();

    }

    public static void main(String[] args) {
        // String str = "Yuvrajdff hjhnghdfsd";
        // System.out.println("Hello yar ");

        String str = "a";

        int leng = strLength(str);
        System.out.println("The result is " + leng);
    }

}

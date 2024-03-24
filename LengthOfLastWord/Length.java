
package LengthOfLastWord;

public class Length {

    public static void strLength(String str) {

        int count = 0;
        for (int i = str.length(); i > 0; i--) {

            if (Character.isWhitespace(i)) {
                count++;
                break;
            }

            // count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "Yuvrajdff hjhnghdfsd";

        strLength(str);
    }

}

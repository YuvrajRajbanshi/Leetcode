package LowerCase;

public class Lower {

    public static String lowerCase(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {

                result += (char) (ch + 32);

            } else {

                result += str.charAt(i);
            }
        }

        return result;

    }

    public static void main(String[] args) {

        String str = "YuvrajSingh";
        // System.out.println(lowerCase(str));

        float val1 = 1.1f;
        float val2 = 1.99f;
        System.out.println(Math.ceil(val1));
        System.out.println(Math.ceil(val2));

    }

}

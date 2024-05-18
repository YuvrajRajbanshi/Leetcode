package ReverseII;

// String problem yar 

// 541
public class Reverse {

    public static String revStr(String str, int k) {

        char[] ch = str.toCharArray();
        int low = 0;
        while (low != k) {
            char temp = ch[low];
            ch[low] = ch[k];
            ch[k] = temp;
            low++;
            k--;
        }

        String result = new String(ch);
        return result;
    }

    public static void main(String[] args) {

        int k = 4;
        String s = "abcdefg";
        System.out.println(revStr(s, k));
        // revStr(s, k);

    }
}

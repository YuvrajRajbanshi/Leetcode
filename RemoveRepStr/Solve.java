package RemoveRepStr;

public class Solve {

    public static void printNonReapting(String str) {

        // int freq[] = new int[26];

        char[] charArray = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;

        }

        for (int k = 0; k < charArray.length; k++) {
            System.out.print(charArray[i]);

        }

    }

    public static void main(String[] args) {

        String name = "Yuvraj ";
        printNonReapting(name);

    }

}

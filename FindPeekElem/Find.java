package FindPeekElem;

public class Find {

    public static int findPeek(int num[]) {

        // int max = Integer.MIN_VALUE;
        // int i = 0;
        // while (max < num[i]) {
        // max = num[i];
        // i++;

        // }

        // return max;

        int largest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < num.length; i++) {

            if (largest < num[i]) {
                largest = num[i];
                index = i;
            }

        }
        return index;

    }

    public static void main(String[] args) {

        int find[] = { 1, 3, 5, 2, 80, 10 };

        int result = findPeek(find);

        System.out.println(result);

    }
}

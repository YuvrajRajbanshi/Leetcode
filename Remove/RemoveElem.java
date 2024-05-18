package Remove;

public class RemoveElem {

    public static void remove(int[] myArray) {

        int[] ans = new int[myArray.length];
        int k = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] != myArray[i + 1]) {

                ans[k++] = myArray[i];
            }
        }

        for (int i = 0; i < ans.length; i++) {

            System.out.println(ans[i]);
        }
    }

    public static void main(String[] args) {
        int[] myArray = { 2, 4, 4, 5, 6 };
        remove(myArray);

    }

}

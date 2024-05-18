package Sum;

public class SumInArray {

    public static int[] getIndex(int[] myArray, int target) {

        for (int i = 1; i < myArray.length; i++) {

            for (int j = i; j < myArray.length; j++) {

                if (myArray[j] + myArray[j - i] == target) {

                    // return myArray[i][j];
                    // System.out.println(i + "" + j);

                    return new int[] { j, j - i };
                }

            }
        }
        return null;

    }

    public static void main(String[] args) {

        // int[] myArray = { 2, 7, 11, 13 };
        // int target = 9;

        // Input: nums = [3,2,4], target = 6
        // Output: [1,2]

        int[] myArray = { 3, 2, 4 };
        int target = 6;

        System.out.println(getIndex(myArray, target));
    }

}

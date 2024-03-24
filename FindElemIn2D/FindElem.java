package FindElemIn2D;

public class FindElem {
    public static boolean findVal(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {

                    return true;
                }

            }
        }
        return false;

    }

    public static void main(String[] args) {

        // int myArray[3][3] = {{ 1, 4, 5, 8, 11, 21}};
        int target = 3;
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix = { { 1, 3 } };

        System.out.println(findVal(matrix, target));

    }
}

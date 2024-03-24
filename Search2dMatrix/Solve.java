package Search2dMatrix;

/**
 * Solve
 */
public class Solve {

    public static boolean searchElem(int matrix[][], int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {

        int target = 5;
        // int matrix[][] = { { 1, 3, 4, 5 }, { 1, 4, 5, 6 } };
        int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };

        System.out.println(searchElem(matrix, target));
    }
}
package SpiralMatrixByArrayList;

import java.util.*;

public class Solve {

    public static void SpiralMatrix(ArrayList<ArrayList<Integer>> matrix) {

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.size() - 1;
        int colEnd = matrix.get(0).size() - 1;

        while (rowStart <= colEnd && colStart <= rowEnd) {

            for (int i = colStart; i <= colEnd; i++) {
                System.out.print("[" + rowStart + "," + i + "] " + matrix.get(rowStart).get(i) + " ");
            }

            for (int i = rowStart; i <= rowEnd; i++) {

                // System.out.print(matrix.get(rowStart) matrix.get(i));
            }
        }

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {

            return result;
        }

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse top row from left to right
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            // Traverse right column from top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Traverse bottom row from right to left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            // Traverse left column from bottom to top
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        list3.add(7);
        list3.add(8);
        list3.add(9);

        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);

        // System.out.println(matrix);

        // SpiralMatrix(matrix);

        // int size = matrix.size();
        // System.out.println(size);

        int myArray[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        List<Integer> result = spiralOrder(myArray);
        System.out.println(result);
    }
}

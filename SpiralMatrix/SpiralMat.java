package SpiralMatrix;

public class SpiralMat {

    public static void main(String args[]) {
        int n = 3;
        int matrix[][] = generateMatrix(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse top row
            for (int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = num++;
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }
            endCol--;

            // Traverse bottom row
            for (int i = endCol; i >= startCol; i--) {
                matrix[endRow][i] = num++;
            }
            endRow--;

            // Traverse left column
            for (int i = endRow; i >= startRow; i--) {
                matrix[i][startCol] = num++;
            }
            startCol++;
        }

        return matrix;
    }
}

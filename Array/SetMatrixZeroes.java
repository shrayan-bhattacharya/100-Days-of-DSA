//https://leetcode.com/problems/set-matrix-zeroes/

/**
 * SetMatrixZeroes
 */
import java.util.*;

public class SetMatrixZeroes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    int rows = matrix.length;
    int cols = matrix[0].length;

    boolean rowZero = false;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;

          if (i > 0) {
            matrix[i][0] = 0;
          } else {
            rowZero = true;
          }
        }
      }
    }
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if (matrix[0][0] == 0) {
      for (int i = 0; i < rows; i++) {
        matrix[i][0] = 0;
      }
    }
    if (rowZero) {
      for (int i = 0; i < cols; i++) {
        matrix[0][i] = 0;
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegative {

  // Brute Force
  //   public int countNegatives(int[][] grid) {
  //     int start = 0, end = grid.length - 1;
  //     int count = 0;
  //     for (int i = 0; i < grid.length; i++) {
  //       for (int j = 0; j < grid[i].length; j++) {
  //         if (grid[i][j] < 0) {
  //           count++;
  //         }
  //       }
  //     }
  //     return count;
  //   }

  //optimised

  public int countNegatives(int[][] grid) {
    int rows = grid.length - 1, columns = grid[0].length, p = 0, count = 0;

    while (rows >= 0 && p < columns) {
      if (grid[rows][p] < 0) {
        rows--;
        count = count + (columns - p);
      } else {
        p++;
      }
    }
    return count;
  }
}

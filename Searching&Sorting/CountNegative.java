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
    int m = grid.length - 1, n = grid[0].length, p = 0, count = 0;

    while (m >= 0 && p < n) {
      if (grid[m][p] < 0) {
        m--;
        count += n - p;
      } else {
        p++;
      }
    }
    return count;
  }
}

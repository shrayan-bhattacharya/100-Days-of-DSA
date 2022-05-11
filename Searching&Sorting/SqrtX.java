//https://leetcode.com/problems/sqrtx/

public class SqrtX {

  public int mySqrt(int x) {
    long start = 0, end = x, ans = 0;
    while (start <= end) {
      long mid = start + (end - start) / 2;
      if (mid * mid <= x) {
        ans = mid;
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return (int) ans;
  }
}

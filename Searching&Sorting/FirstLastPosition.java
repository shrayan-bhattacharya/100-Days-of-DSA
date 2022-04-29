//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstLastPosition {

  public static void searchRange(int[] a, int target) {
    int[] result = { -1, -1 };

    if (a == null || a.length == 0) {
      for (int i = 0; i < result.length; i++) {
        System.out.print("[" + result[i] + "]");
      }
    }

    result[0] = binSearch(a, target, true);
    result[1] = binSearch(a, target, false);
    for (int i = 0; i < result.length; i++) {
      System.out.print("[" + result[i] + "]");
    }
  }

  //   public int[] searchRange(int[] a, int target) {
  //     int[] result = { -1, -1 };

  //     if (a == null || a.length == 0) return result;

  //     result[0] = binSearch(a, target, true);
  //     result[1] = binSearch(a, target, false);

  //     return result;
  //   }

  public static int binSearch(int[] a, int target, boolean startbias) {
    int left = 0;
    int right = a.length - 1;
    int position = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (a[mid] == target) {
        position = mid; // this is position

        if (startbias) right = mid - 1; else left = mid + 1;
      } else if (target > a[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return position;
  }

  public static void main(String[] args) {
    int arr[] = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    searchRange(arr, target);
  }
}

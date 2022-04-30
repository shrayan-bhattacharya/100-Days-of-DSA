//https://leetcode.com/problems/sort-colors/

public class CountSort {

  public static void sortColors(int[] A) {
    if (A == null || A.length < 2) return;
    int low = 0;
    int high = A.length - 1;
    for (int i = low; i <= high;) {
      if (A[i] == 0) {
        // swap A[i] and A[low] and i,low both ++
        int temp = A[i];
        A[i] = A[low];
        A[low] = temp;
        i++;
        low++;
      } else if (A[i] == 2) {
        //swap A[i] and A[high] and high--;
        int temp = A[i];
        A[i] = A[high];
        A[high] = temp;
        high--;
      } else {
        i++;
      }
    }
  }

  public static void main(String[] args) {
    int nums[] = { 2, 0, 2, 1, 1, 0 };
    sortColors(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
    }
  }
}

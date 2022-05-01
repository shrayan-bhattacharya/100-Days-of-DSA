/**
 * Remove_Min_Max
 */
public class Remove_Min_Max {

  public static int minimumDeletions(int[] nums) {
    int minIdx = -1;
    int maxIdx = -1;

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (min > nums[i]) {
        min = nums[i];
        minIdx = i;
      }

      if (max < nums[i]) {
        max = nums[i];
        maxIdx = i;
      }
    }

    int n = nums.length;

    int firstDiff = Math.max(maxIdx, minIdx) + 1;
    int lastDiff = n - Math.min(maxIdx, minIdx);
    int midDiff = n - Math.max(maxIdx, minIdx) + Math.min(maxIdx, minIdx) + 1;

    return Math.min(Math.min(firstDiff, lastDiff), midDiff);
  }

  public static void main(String[] args) {
    int nums[] = { 2, 10, 7, 5, 4, 1, 8, 6 };
    System.out.println(minimumDeletions(nums));
  }
}

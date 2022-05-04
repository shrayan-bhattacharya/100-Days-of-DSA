//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

  public int maxSubArray(int[] nums) {
    int maxSub = nums[0];
    int currentSum = 0;

    for (int i = 0; i < nums.length; i++) {
      if (currentSum < 0) {
        currentSum = 0;
      }
      currentSum += nums[i];
      maxSub = Math.max(maxSub, currentSum);
    }
    return maxSub;
  }
}

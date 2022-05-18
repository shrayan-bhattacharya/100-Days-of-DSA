//https://leetcode.com/problems/contains-duplicate/

public class ContainsDupli {

  public boolean containsDuplicate(int[] nums) {
    for (int index = 0; index < nums.length; index++) {
      for (int i = index + 1; i < nums.length; i++) {
        if (nums[i] == nums[index]) {
          return true;
        }
      }
    }
    return true;
  }
}

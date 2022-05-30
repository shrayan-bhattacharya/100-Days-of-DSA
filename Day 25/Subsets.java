import java.util.*;

public class Subsets {
  static List<List<Integer>> ans;

  public static void solve(int nums[], ArrayList<Integer> output, int index) {
    // Base Case
    if (index >= nums.length) {
      ans.add(output);
      return;
    }

    // exclude
    solve(nums, output, index + 1);

    // include
    output.add(nums[index]);
    solve(nums, output, index + 1);
    output.remove(output.size() - 1);
  }

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> output = new ArrayList<>();

    if (nums == null || nums.length == 0) return ans;
    int index = 0;

    solve(nums, output, index);
    return ans;
  }

  public static void main(String[] args) {}
}

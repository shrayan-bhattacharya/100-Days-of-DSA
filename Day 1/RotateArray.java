//https://leetcode.com/problems/rotate-array/
package Array;

// O(1) Approach

import java.util.Scanner;

/**
 * RotateArray
 */
public class RotateArray {

  public static void rotate(int arr[], int k) {
    k %= arr.length;
    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);
  }

  public static void reverse(int arr[], int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    rotate(nums, k);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
    }
  }
}

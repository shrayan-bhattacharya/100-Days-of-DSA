public class SumArray {

  static int sumHelper(int arr[], int idx, int size, int sum) {
    if (idx == size) return sum;
    int currSum = sum + arr[idx];
    return sumHelper(arr, idx + 1, size, currSum);
  }

  static int sum(int arr[]) {
    if (arr.length == 1) {
      return arr[0];
    } else {
      return sumHelper(arr, 0, arr.length, 0);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 2, 5, 1, 6 };
    int ans = sum(arr);

    System.out.println(ans);
  }
}

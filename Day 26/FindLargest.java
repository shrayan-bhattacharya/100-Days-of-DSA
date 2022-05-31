public class FindLargest {

  static int largest(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 8, 9, 1 };
    System.out.println(largest(arr));
  }
}

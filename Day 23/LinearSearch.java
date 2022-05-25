public class LinearSearch {

  static boolean search(int arr[], int idx, int size, int value) {
    if (idx == size) return false;
    if (arr[idx] == value) return true;

    return search(arr, idx + 1, size, value);
  }

  public static void main(String[] args) {
    int arr[] = { 3, 2, 5, 1, 6 };
    System.out.println(search(arr, 0, arr.length, 7));
  }
}

public class BinarySearch {

  static boolean searchHelper(int arr[], int start, int end, int key) {
    //base condition
    if (start > end) return false;

    int mid = (start + end) / 2;

    if (arr[mid] == key) return true;
    if (arr[mid] < key) return searchHelper(
      arr,
      mid + 1,
      end,
      key
    ); else return searchHelper(arr, start, mid - 1, key);
  }

  static boolean search(int arr[], int key) {
    return searchHelper(arr, 0, arr.length - 1, key);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 10, 14, 16 };
    System.out.println(search(arr, 15));
  }
}

/**
 * IsSorted
 */
public class IsSorted {

  public static boolean sortedHelper(int[] arr, int idx, int size) {
    //base case
    if (idx == size) return true;

    //case to check previous element is greater than current element
    if (arr[idx - 1] > arr[idx]) return false;
    return sortedHelper(arr, idx + 1, size); // if reached till here we have to check for remaining element
  }

  public static boolean checkSorted(int[] arr, int size) {
    if (size <= 1) return true;
    return sortedHelper(arr, 1, size);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 9 };
    int size = arr.length;

    boolean ans = checkSorted(arr, 5);
    if (ans) System.out.println("Array is Sorted"); else System.out.println(
      "Array is unsorted"
    );
  }
}

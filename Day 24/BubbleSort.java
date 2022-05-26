import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

  static void sortArray(ArrayList<Integer> arr, int n) {
    if (n == 0 || n == 1) return;

    for (int i = 0; i < n - 1; i++) {
      if (arr.get(i) > arr.get(i + 1)) {
        // int temp = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = temp;

        Collections.swap(arr, i, i + 1);
      }
    }
    sortArray(arr, n - 1);
  }

  public static void main(String[] args) {
    // int arr[] = { 2, 5, 6, 9, 1 };
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(54);
    arr.add(6);
    arr.add(92);
    arr.add(1);
    sortArray(arr, arr.size());

    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + " ");
    }
  }
}

import java.util.*;

public class ReverseTheArray {

  static void reverseArrayHelper(int l, int r, ArrayList<Integer> arr) {
    if (l >= r) return;
    Collections.swap(arr, l, r);
    reverseArrayHelper(l + 1, r - 1, arr);
  }

  static void reverseArray(ArrayList<Integer> arr, int m) {
    reverseArrayHelper(m + 1, arr.size() - 1, arr);
  }
}

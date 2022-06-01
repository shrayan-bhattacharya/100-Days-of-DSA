import java.util.*;

public class SwapAlternate {

  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void swap(int arr[], int size) {
    for (int i = 0; i < size; i += 2) {
      if (i + 1 < size) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int even[] = { 2, 3, 4, 5, 56, 677, 12, 36 };
    int odd[] = { 5, 56, 677, 12, 36 };

    swap(even, even.length);
    printArray(even);

    System.out.println();

    swap(odd, odd.length);
    printArray(odd);
  }
}

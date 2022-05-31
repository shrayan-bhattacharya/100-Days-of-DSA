import java.util.*;

/* 

partition:
{
    place pivot at right position
    swap arr[pivotIndex] and arr[s]
    left and right sorting
}

sort left and right using recursion


*/

public class QuickSort {

  public static int partition(int arr[], int s, int e) {
    int pivot = arr[s];

    int count = 0;
    for (int i = s + 1; i <= e; i++) {
      if (arr[i] <= pivot) count++;
    }
    // place pivot at right position
    int pivotIndex = s + count;

    // swap arr[pivotIndex] and arr[s]
    int temp = arr[pivotIndex];
    arr[pivotIndex] = arr[s];
    arr[s] = temp;

    //left and right sorting
    int i = 0, j = e;
    while (i < pivotIndex && j > pivotIndex) {
      while (arr[i] < pivot) i++;
      while (arr[j] > pivot) j--;

      if (i < pivotIndex && j > pivotIndex) {
        int temp2 = arr[i];
        arr[i] = arr[j];
        arr[j] = temp2;
        i++;
        j--;
      }
    }
    return pivotIndex;
  }

  public static void quickSort(int arr[], int s, int e) {
    if (s >= e) return;

    int p = partition(arr, s, e);

    //sort left
    quickSort(arr, s, p - 1);

    //sort right
    quickSort(arr, p + 1, e);
  }

  public static void main(String[] args) {
    int arr[] = { 9, 3, 4, 54, 5, 6, 7 };
    System.out.println("Before Sorting");

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    quickSort(arr, 0, arr.length - 1);
    System.out.println("After Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  //   public static int partition(List<Integer> arr, int s, int e) {
  //     int pivot = arr.get(s);

  //     int count = 0;
  //     for (int i = s + 1; i <= e; i++) {
  //       if (arr.get(i) <= pivot) count++;
  //     }
  //     // place pivot at right position
  //     int pivotIndex = s + count;

  //     // swap arr[pivotIndex] and arr[s]
  //     int temp = arr.get(pivotIndex);
  //     arr.set(pivotIndex, arr.get(s));
  //     arr.set(s, temp);

  //     //left and right sorting
  //     int i = 0, j = e;
  //     while (i < pivotIndex && j > pivotIndex) {
  //       while (arr.get(i) < pivot) i++;
  //       while (arr.get(j) > pivot) j--;

  //       if (i < pivotIndex && j > pivotIndex) {
  //         int temp2 = arr.get(i);
  //         arr.set(i, arr.get(j));
  //         arr.set(j, temp2);
  //         i++;
  //         j--;
  //       }
  //     }
  //     return pivotIndex;
  //   }

  //   public static void solve(List<Integer> arr, int s, int e) {
  //     if (s >= e) return;

  //     int p = partition(arr, s, e);

  //     //sort left
  //     solve(arr, s, p - 1);

  //     //sort right
  //     solve(arr, p + 1, e);
  //   }

  //   public static List<Integer> quickSort(List<Integer> arr) {
  //     solve(arr, 0, arr.size() - 1);
  //     return arr;
  //   }
}

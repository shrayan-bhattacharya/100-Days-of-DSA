import java.util.*;

public class ReverseArray {

  public static void printarray(int arr[], int size) {
    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
    System.out.println("");
  }

  public static void reversearray(int arr[], int start, int end) {
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
    int test = sc.nextInt();
    for (int i = 1; i <= test; i++) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int j = 0; j < arr.length; j++) {
        arr[j] = sc.nextInt();
      }
      reversearray(arr, 0, n - 1);
      printarray(arr, n);
    }
  }
}
// Scanner sc = new Scanner(System.in);
// int test = sc.nextInt();
// for (int i = 1; i <= test; i++) {
//   int n = sc.nextInt();
//   int arr[] = new int[n];
//   for (int j = 0; j < arr.length; j++) {
//     arr[j] = sc.nextInt();
//   }
//   for (int j = arr.length - 1; j >= 0; j--) {
//     System.out.print(arr[j] + " ");
//   }
// }

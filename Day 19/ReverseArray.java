// public class ReverseArray {

//   static void swap(int i, int j) {
//     int temp = i;
//     i = j;
//     j = temp;
//   }

//   static void reverse(int i, int arr[], int n) {
//     if (i >= n / 2) return;
//     swap(arr[i], arr[n - i - 1]);
//     reverse(i + 1, arr, n);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int arr[] = new int[n];
//     for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//     }
//     reverse(0, arr, n);
//     for (int i = 0; i < n; i++) {
//       System.out.print(arr[i] + " ");
//     }
//   }
// }

class ReverseArray {

  /* Function to reverse arr[] from start to end*/
  static void rvereseArray(int arr[], int start, int end) {
    int temp;
    if (start >= end) return;
    temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    rvereseArray(arr, start + 1, end - 1);
  }

  /* Utility that prints out an array on a line */
  static void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
    System.out.println("");
  }

  /*Driver function to check for above functions*/
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    printArray(arr, 6);
    rvereseArray(arr, 0, 5);
    System.out.println("Reversed array is ");
    printArray(arr, 6);
  }
}
/*This article is contributed by Devesh Agrawal*/

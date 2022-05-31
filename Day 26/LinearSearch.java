public class LinearSearch {

  public static boolean search(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 9, 3, 4, 5, 6, 8, 89, 7, 5, 32 };
    System.out.println(search(arr, 89));
  }
}

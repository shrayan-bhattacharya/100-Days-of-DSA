public class FindSmallest {

  static int smallest(int arr[]) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) min = arr[i];
    }
    return min;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 8, 9, 1 };
    System.out.println(smallest(arr));
  }
}

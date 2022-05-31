public class ReverseArrayBabbar {

  public static void reverse(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 9, 3, 4, 5, 6, 8, 89, 7, 5, 32, 51 };
    reverse(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

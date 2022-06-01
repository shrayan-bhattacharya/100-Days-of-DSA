public class SecondSmallestSecondLargest {

  public static void find(int arr[]) {
    if (arr.length == 0 || arr.length == 1) {
      System.out.println("Second Smallest : -1");
      System.out.println("Second Largest : -1");
      return;
    }
    int max = 0, min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) max = arr[i];
      if (arr[i] < min) min = arr[i];
    }
    int max2 = 0, min2 = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == max || arr[i] == min) continue;
      if (arr[i] > max2) max2 = arr[i];
      if (arr[i] < min2) min2 = arr[i];
    }
    System.out.println("Second Smallest : " + min2);
    System.out.println("Second Largest : " + max2);
  }

  public static void main(String[] args) {
    int arr[] = { 1 };
    find(arr);
  }
}

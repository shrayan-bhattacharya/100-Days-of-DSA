import java.util.*;

public class FindUnique {

  public static int findUnique(int[] arr) {
    int ans = 0;

    for (int i = 0; i < arr.length; i++) {
      ans = ans ^ arr[i];
    }
    return ans;
  }
}

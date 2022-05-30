import java.util.*;

public class OddEven {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    int arr[] = new int[test];
    for (int i = 0; i < test; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < test; i++) {
      if (arr[i] % 2 == 0) System.out.println("EVEN"); else System.out.println(
        "ODD"
      );
    }
  }
}

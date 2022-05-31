import java.util.*;

public class DivisibleBySix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int n = sc.nextInt();
      if (n % 6 == 0) System.out.println("True"); else System.out.println(
        "False"
      );
    }
  }
}

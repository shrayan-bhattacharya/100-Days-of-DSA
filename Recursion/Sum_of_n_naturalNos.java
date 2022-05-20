import java.util.Scanner;

/**
 * Sum_of_n_naturalNos
 */
public class Sum_of_n_naturalNos {

  static void sumf(int i, int sum) {
    if (i < 1) {
      System.out.println(sum);
      return;
    }
    sumf(i - 1, sum + i);
  }

  // static int sumf(int n) {
  //   if (n == 1) return 1;
  //   return n + sumf(n - 1);
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    // System.out.print(sumf(n));
    sumf(n, 0);
  }
}

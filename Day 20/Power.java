//https://www.codingninjas.com/codestudio/problems/find-power-of-a-number_893198
public class Power {

  // Optimised Approach
  public static long Pow(int X, int N) {
    if (N == 0) return 1;
    long temp = Pow(X, N / 2);

    if (N % 2 != 0) return temp * temp * X;
    return temp * temp;
  }

  //   public static long Pow(int X, int N) {
  //     if (N == 0) return 1;
  //     return Pow(X * X, N - 1);
  //   }

  public static void main(String[] args) {
    System.out.println(Pow(3, 4));
  }
}

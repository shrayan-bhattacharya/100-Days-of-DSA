//Fibonacci using multiple Recursion

public class Fib2 {

  static int f(int n) {
    if (n <= 1) return n;
    int last = f(n - 1);
    int slast = f(n - 2);
    return last + slast;
  }

  public static void main(String[] args) {
    System.out.println(f(6));
  }
}

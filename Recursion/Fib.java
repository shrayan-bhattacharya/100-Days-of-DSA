//https://www.codingninjas.com/codestudio/problems/nth-fibonacci-number_74156?leftPanelTab=0
import java.util.Scanner;

public class Fib {

  static int nthTerm(int n) {
    if (n == 1 || n == 2) return 1;
    return nthTerm(n - 1) + nthTerm(n - 2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.print(nthTerm(n));
  }
}

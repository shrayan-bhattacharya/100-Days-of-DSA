import java.util.Scanner;

public class PrintName {

  public static void name(int i, int n) {
    if (i > n) return;
    System.out.println("Shrayan");
    name(i + 1, n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    name(1, n);
  }
}

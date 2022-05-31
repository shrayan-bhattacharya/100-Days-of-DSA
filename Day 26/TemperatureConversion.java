import java.util.*;

public class TemperatureConversion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      double c = sc.nextDouble();
      double f = (9 * c / 5) + 32;
      System.out.format("%.2f\n", f);
    }
  }
}

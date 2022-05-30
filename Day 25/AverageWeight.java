import java.util.*;

public class AverageWeight {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double arr[] = new double[10];

    for (int i = 0; i < 10; i++) {
      arr[i] = sc.nextDouble();
    }
    double sum = 0.0, avg = 0.0;
    for (int i = 0; i < 10; i++) {
      sum = sum + arr[i];
    }
    avg = sum / 10;
    System.out.format("%.6f", avg);
  }
}

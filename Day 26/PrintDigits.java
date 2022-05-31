import java.util.*;

class PrintDigits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      int j = sc.nextInt();
      String string_number = Integer.toString(j);
      for (int k = 0; k < string_number.length(); k++) {
        System.out.print(string_number.charAt(i) + " ");
      }
    }
  }
}

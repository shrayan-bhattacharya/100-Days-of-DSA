public class Palin {

  static boolean check(String str, int i, int j) {
    if (i > j) return true;

    if (str.charAt(i) != str.charAt(j)) return false;

    return check(str, i + 1, j - 1);
  }

  public static void main(String[] args) {
    String name = "abba";

    boolean isPal = check(name, 0, name.length() - 1);
    if (isPal) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

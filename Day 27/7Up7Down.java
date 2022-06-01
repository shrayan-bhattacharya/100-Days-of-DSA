import java.util.*;

class WorkAtTech {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      if (n > 7) System.out.println("UP"); else if (n == 7) System.out.println(
        "EQUAL"
      ); else System.out.println("DOWN");
    }
  }
}

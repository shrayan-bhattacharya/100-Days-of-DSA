import java.util.*;

class Triangle {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int l1 = sc.nextInt();
      int l2 = sc.nextInt();
      int l3 = sc.nextInt();
      if (
        ((l1 + l2) >= l3) && ((l2 + l3) >= l1) && ((l1 + l3) >= l2)
      ) System.out.println(l1 + l2 + l3); else System.out.println(-1);
    }
  }
}

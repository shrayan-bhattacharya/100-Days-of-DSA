import java.util.*;

public class BasicIO {

  /**
   * AreaRectangle
   */
  class AreaRectangle {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(l * b);
    }
  }

  class PrintNameAndAge {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      int age = sc.nextInt();
      System.out.println(
        "The name of the person is " + name + " and the age is " + age
      );
    }
  }

  class SimpleInterest {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int p = sc.nextInt();
      float r = sc.nextFloat();
      int t = sc.nextInt();
      float result = (p * r * t) / 100;
      int result2 = (int) result;
      System.out.println(result2);
    }
  }
}

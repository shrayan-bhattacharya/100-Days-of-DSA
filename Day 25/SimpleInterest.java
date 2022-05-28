/*
Your father has given you some money and you are trying to decide what you want to do with that money. Your friend gives you the idea of an investment that gives you simple interest for your money.

If you invest a sum of p for t years at a rate of r%, the formula for simple interest will be -

Interest = (p*r*t)/100

Given the rate of interest and the time you can invest for, calculate the interest you will recieve.

Input Format
A single line with 3 space-separated parameters: Principal, Rate, Time

Output Format
Interest

The value should be accurate upto exactly 6 decimal places.

Examples
Sample Input 1
1500 1.4 3
Expected Output
63.000000
Sample Input 2
2532.4 6.33 3.67
Expected Output
588.304376
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class SimpleInterest {

  class WorkAtTech {

    public static void main(String[] args) throws java.lang.Exception {
      Scanner sc = new Scanner(System.in);
      double p = sc.nextDouble();
      double r = sc.nextDouble();
      double t = sc.nextDouble();

      double ans1 = (p * r * t) / 100;
      double ans2 = Math.round(ans1 * 1000000) / 1000000.0;
      System.out.print(ans2);
    }
  }
}

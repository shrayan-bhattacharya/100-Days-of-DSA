/*
You and your friend decide to play a game where given some numbers, you have to find the maximum number. If the maximum is an even number, you win and if it is odd, your friend wins.

Input Format
Two lines:

First line contains a single integer N
Second line contains N space separated integers
N
n1 n2 n3 ..... nN
Output Format
Your winning status. If you win, print WON and if you lose, print LOST.

Examples
Sample Input
5
12 45 234 5674 122
Expected Output
WON
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class WinOrLose {

  class WorkAtTech {

    public static void main(String[] args) throws java.lang.Exception {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int max = 0;

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      for (int i = 0; i < n; i++) {
        if (arr[i] > max) max = arr[i];
      }
      if (max % 2 == 0) System.out.println("WON"); else System.out.println(
        "LOST"
      );
    }
  }
}

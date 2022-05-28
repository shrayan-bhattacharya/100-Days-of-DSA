//Write a program to print the sum of the first 10 numbers (1-10).

import java.io.*;
import java.lang.*;
import java.util.*;

public class SumUptoTen {

  class WorkAtTech {

    public static void main(String[] args) throws java.lang.Exception {
      int i = 1, sum = 0;
      while (i <= 10) {
        sum = sum + i;
        i++;
      }
      System.out.println(sum);
    }
  }
}

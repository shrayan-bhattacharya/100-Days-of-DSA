//https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWord {

  public static void reverse(char[] a, int i, int j) {
    while (i < j) {
      char t = a[i];
      a[i++] = a[j];
      a[j--] = t;
    }
  }

  public static void reverseWords(char[] a, int n) {
    int i = 0, j = 0;

    while (i < n) {
      while (i < j || i < n && a[i] == ' ') i++; // skip spaces
      while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
      reverse(a, i, j - 1); // reverse the word
    }
  }

  // trim leading, trailing and multiple spaces
  public static String cleanSpaces(char[] a, int n) {
    int i = 0, j = 0;

    while (j < n) {
      while (j < n && a[j] == ' ') j++; // skip spaces
      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
      while (j < n && a[j] == ' ') j++; // skip spaces
      if (j < n) a[i++] = ' '; // keep only one space
    }

    return new String(a).substring(0, i);
  }

  public static void main(String[] args) {
    String s = " Hello! World";
    char[] a = s.toCharArray();
    int n = a.length;

    // step 1. reverse the whole string
    reverse(a, 0, n - 1);
    // step 2. reverse each word
    reverseWords(a, n);
    // step 3. clean up spaces
    String new_string = cleanSpaces(a, n);

    System.out.println(new_string);
  }
}

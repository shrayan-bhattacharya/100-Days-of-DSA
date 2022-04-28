//https://leetcode.com/problems/reverse-string/
public class ReverseString {

  public static void reverse(char[] s) {
    int start = 0;
    int end = s.length - 1;
    while (start < end) {
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
    return;
  }

  public static void main(String[] args) {
    String s = "Hello";
    char[] word = s.toCharArray();
    reverse(word);
    String n = "";
    s = n.valueOf(word);
    System.out.println(s);
  }
}

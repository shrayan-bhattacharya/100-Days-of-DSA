public class ReverseString {

  public void reverseString(char[] s) {
    help(s, 0, s.length - 1);
  }

  public void help(char[] s, int start, int end) {
    if (start >= end) return;

    swap(s, start, end);
    help(s, start++, end--);
  }

  public void swap(char[] s, int start, int end) {
    char temp = s[start];
    s[start] = s[end];
    s[end] = temp;
  }
}

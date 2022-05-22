//https://www.codingninjas.com/codestudio/problems/check-palindrome_4219630?source=youtube&campaign=Recursion_Fraz&utm_source=youtube&utm_medium=affiliate&utm_campaign=Recursion_Fraz
public class PalindromeString {

  public static Boolean isPalindromeHelper(int l, int r, String s) {
    if (l >= r) return true;
    if (s.charAt(l) != s.charAt(r)) return false;

    return isPalindromeHelper(l + 1, r - 1, s);
  }

  public static Boolean isPalindrome(String s) {
    return isPalindromeHelper(0, s.length() - 1, s);
  }

  public static void main(String[] args) {
    isPalindrome("ABBA");
  }
}

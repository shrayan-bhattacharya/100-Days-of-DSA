//https://leetcode.com/problems/valid-palindrome/
public class Valid_Palindrome {

  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    StringBuilder newStr = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetterOrDigit(s.charAt(i))) {
        newStr.append(s.charAt(i));
      }
    }
    int n = newStr.length() - 1;
    for (int i = 0; i < newStr.length() / 2; i++) {
      if (newStr.charAt(i) != newStr.charAt(n - i)) {
        return false;
      }
    }
    return true;
  }
}

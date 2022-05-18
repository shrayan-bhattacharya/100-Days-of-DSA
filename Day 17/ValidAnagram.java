//https://leetcode.com/problems/valid-anagram/
import java.util.Arrays;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    char[] cs = s.toCharArray();
    char[] ct = t.toCharArray();

    Arrays.sort(cs);
    Arrays.sort(ct);

    return Arrays.equals(cs, ct);
  }
}

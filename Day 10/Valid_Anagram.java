import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram/submissions/

public class Valid_Anagram {

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

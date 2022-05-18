import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAna {

  public List<String> removeAnagrams(String[] A) {
    List<String> ans = new ArrayList<>();
    int n = A.length;
    for (int i = 0; i < n;) {
      int j = i + 1;
      while (j < n && isAnagram(A[i], A[j])) j++;
      ans.add(A[i]);
      i = j;
    }
    return ans;
  }

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

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

  public static String swap(String s, int i, int j) {
    char temp;
    char[] strArray = s.toCharArray();
    temp = strArray[i];
    strArray[i] = strArray[j];
    strArray[j] = temp;
    return String.valueOf(strArray);
  }

  public static void permute(
    ArrayList<String> ans,
    String str,
    int pos,
    int length
  ) {
    if (pos == length) ans.add(str); else {
      for (int i = pos; i < length; i++) {
        str = swap(str, pos, i);
        permute(ans, str, pos + 1, length);
        str = swap(str, pos, i);
      }
    }
  }

  public static ArrayList<String> generatePermutations(String str) {
    ArrayList<String> ans = new ArrayList<>();
    permute(ans, str, 0, str.length());
    Collections.sort(ans);
    return ans;
  }
}

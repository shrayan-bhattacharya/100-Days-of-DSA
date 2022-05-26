public class Reverse_String {

  public static void reverse(char[] ch, int l, int r) {
    if (l > r) return;

    char temp = ch[l];
    ch[l] = ch[r];
    ch[r] = temp;
    reverse(ch, l + 1, r - 1);
  }

  public static void main(String[] args) {
    String name = "Shrayan";
    char ch[] = name.toCharArray();
    reverse(ch, 0, 6);

    name = new String(ch);
    System.out.println(name);
  }
}

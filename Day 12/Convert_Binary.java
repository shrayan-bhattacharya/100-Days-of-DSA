//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class Convert_Binary {

  public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public int getDecimalValue(ListNode head) {
    int ans = 0;

    ListNode temp = head;
    while (temp != null) {
      ans = ans * 2;
      ans = ans + temp.val;
      temp = temp.next;
    }
    return ans;
  }
}

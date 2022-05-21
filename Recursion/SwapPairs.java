// https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapPairs {

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

  class Solution {

    public ListNode swapPairs(ListNode head) {
      if (head == null || head.next == null) {
        return head;
      }
      ListNode n = new ListNode();
      swapPairs(head.next.next);
      n.next = head;
      return n;
    }
  }
}

//https://leetcode.com/problems/linked-list-cycle/
public class ListCycle {

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public class Solution {

    public boolean hasCycle(ListNode head) {
      ListNode walk = head;
      ListNode run = head;

      while (run != null && run.next != null) {
        walk = walk.next;
        run = run.next.next;
        if (walk == run) {
          return true;
        }
      }
      return false;
    }
  }
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDupli {

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

    public ListNode deleteDuplicates(ListNode head) {
      ListNode dummy = new ListNode(0);
      ListNode ptr = head;
      while (ptr.next != null) {
        ListNode ptr2 = ptr;
        while (ptr2 != null) {
          if (ptr2.val == ptr.val) {
            dummy.val = ptr2.val;
            dummy = dummy.next;
          }
        }
        dummy.val = ptr.val;
        dummy = dummy.next;
      }
      return dummy;
    }
  }
}

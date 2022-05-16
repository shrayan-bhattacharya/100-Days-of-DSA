//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeList {

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

    public ListNode reverse(ListNode head) {
      ListNode prev = null;
      while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
      }
      return prev;
    }

    public boolean isPalindrome(ListNode head) {
      ListNode walk = head;
      ListNode run = head;

      while (run != null && run.next != null) {
        walk = walk.next;
        run = run.next.next;
      }
      walk = reverse(walk);
      run = head;

      while (walk != null) {
        if (walk.val != run.val) {
          return false;
        }
        walk = walk.next;
        run = run.next;
      }

      return true;
    }
  }
}

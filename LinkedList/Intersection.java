//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Intersection {

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int lenA = length(headA), lenB = length(headB);
      // move headA and headB to the same start point
      while (lenA > lenB) {
        headA = headA.next;
        lenA--;
      }
      while (lenA < lenB) {
        headB = headB.next;
        lenB--;
      }
      if (headA == headB) {
        return headA;
      }
      while (headA != headB) {
        headA = headA.next;
        headB = headB.next;
        if (headA == null) {
          return null;
        }
      }
      return headA;
    }

    private int length(ListNode node) {
      int length = 0;
      while (node != null) {
        node = node.next;
        length++;
      }
      return length;
    }
  }
}

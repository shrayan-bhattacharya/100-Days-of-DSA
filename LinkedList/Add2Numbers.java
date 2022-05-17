import javax.xml.validation.Validator;

//https://leetcode.com/problems/add-two-numbers/
public class Add2Numbers {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode curr, dummy = new ListNode(0);
      curr = dummy;
      int v1 = 0, v2 = 0;
      int carry = 0;

      while (l1 != null || l2 != null || carry != 0) {
        if (l1 != null) {
          v1 = l1.val;
          l1 = l1.next;
        } else if (l1 == null) {
          v1 = 0;
        }
        if (l2 != null) {
          v2 = l2.val;
          l2 = l2.next;
        } else if (l2 == null) {
          v2 = 0;
        }

        int newDigit = v1 + v2 + carry;
        carry = newDigit / 10;
        newDigit = newDigit % 10;

        curr.next = new ListNode(newDigit);

        curr = curr.next;
      }

      return dummy.next;
    }
  }
}

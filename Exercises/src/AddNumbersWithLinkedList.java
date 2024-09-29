public class AddNumbersWithLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        ListNode prev = head;
        int carry = 0;

        while(l1 != null && l2 != null) {
            cur.val = l1.val + l2.val + carry;
            if (cur.val > 9) {
                cur.val = cur.val - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            prev = cur;
            cur.next = new ListNode(0);
            cur = cur.next;
        }
        while(l1 != null) {
            cur.val = l1.val + carry;
            if (cur.val > 9) {
                cur.val = cur.val - 10;
                carry = 1;
            } else {
                carry = 0;
            }

            l1 = l1.next;
            prev = cur;
            cur.next = new ListNode(0);
            cur = cur.next;
        }
        while(l2 != null) {
            cur.val = l2.val + carry;
            if (cur.val > 9) {
                cur.val = cur.val - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            l2 = l2.next;
            prev = cur;
            cur.next = new ListNode(0);
            cur = cur.next;
        }
        if (carry == 1) {
            prev.next = new ListNode(1, null);
        }

        return head;

    }
}

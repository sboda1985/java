public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null) {
            ListNode newCurrent = current.next;
            while(newCurrent != null && newCurrent.val == current.val) {
                newCurrent = newCurrent.next;
            }
            current.next = newCurrent;
            current = current.next;
        }
        return head;
    }
}

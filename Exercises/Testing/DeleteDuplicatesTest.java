import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DeleteDuplicatesTest {


    @Test
    public void testOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = null;
        DeleteDuplicates d = new DeleteDuplicates();
        ListNode result = d.deleteDuplicates(head);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);


    }
}

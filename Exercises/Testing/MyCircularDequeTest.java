import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCircularDequeTest {
    @Test
    public void testOne() {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        assertEquals(true, myCircularDeque.insertLast(1));  // return True
        assertEquals(true,myCircularDeque.insertLast(2));  // return True
        assertEquals(true,myCircularDeque.insertFront(3)); // return True
        assertEquals(false,myCircularDeque.insertFront(4)); // return False, the queue is full.
        assertEquals(2,myCircularDeque.getRear());      // return 2
        assertEquals(true,myCircularDeque.isFull());       // return True
        assertEquals(true,myCircularDeque.deleteLast());   // return True
        assertEquals(true,myCircularDeque.insertFront(4)); // return True
        assertEquals(4,myCircularDeque.getFront());     // return 4
    }
}

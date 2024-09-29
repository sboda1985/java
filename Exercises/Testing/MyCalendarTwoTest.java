import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyCalendarTwoTest {
    @Test
    public void testOne() {
        MyCalendarTwo calendar = new MyCalendarTwo();
        // 10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]
        // true, true, true, false, true, true
        boolean result = calendar.book(10,20);
        assertEquals(true, result);
         result = calendar.book(50,60);
        assertEquals(true, result);
        result = calendar.book(10,40);
        assertEquals(true, result);
        result = calendar.book(5,15);
        assertEquals(false, result);
        result = calendar.book(5,10);
        assertEquals(true, result);
        result = calendar.book(25,55);
        assertEquals(true, result);

    }
}

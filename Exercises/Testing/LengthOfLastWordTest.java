import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWordTestWithThreeWords() {
        LengthOfLastWord sfo = new LengthOfLastWord();
        int result = sfo.lengthOfLastWord("Test two words");
        assertEquals(5, result, "The last word length should be 5");
    }

    @Test
    public void testLengthOfLastWordTestWithONeeWord() {
        LengthOfLastWord sfo = new LengthOfLastWord();
        int result = sfo.lengthOfLastWord(" Testing");
        assertEquals(7, result, "The last word length should be 7");
    }


}

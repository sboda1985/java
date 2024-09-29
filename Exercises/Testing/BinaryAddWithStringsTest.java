import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryAddWithStringsTest {
    @Test
    public void testBinaryAddDifferentDigits() {
        BinaryAddWithStrings binaryAddWithStrings = new BinaryAddWithStrings();
        String result = binaryAddWithStrings.addBinary ("11", "1");
        assertEquals("100", result);
    }
    @Test
    public void testBinaryAddSameDigit() {
        BinaryAddWithStrings binaryAddWithStrings = new BinaryAddWithStrings();
        String result = binaryAddWithStrings.addBinary ("1010", "1011");
        assertEquals("10101", result);
    }
}

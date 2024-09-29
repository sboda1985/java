import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareRootApproximationTest {
    @Test
    public void testSquareRootApproximation() {
        SquareRootApproximation approximation = new SquareRootApproximation();
        int result = approximation.mySqrt(4);
        assertEquals(2, result);
    }

    @Test
    public void testSquareRootApproximationBigNumber() {
        SquareRootApproximation approximation = new SquareRootApproximation();
        int result = approximation.mySqrt(2147395600);
        assertEquals(46340, result);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumWidthRampTest {

    @Test
    public void Test(){
        MaximumWidthRamp max = new MaximumWidthRamp();
        assertEquals(4, max.maxWidthRamp(new int[]{6,0,8,2,1,5}));
        assertEquals(7, max.maxWidthRamp(new int[]{9,8,1,0,1,9,4,0,4,1}) );
    }
}

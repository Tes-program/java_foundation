package MorningDrill;

import Day5.MorningDrill.LCM;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LCMTest {

    @Test
    void testBasicArray() {
        assertEquals(120, LCM.lcm(new int[]{2, 4, 6, 8, 10}));
    }

    @Test
    void testTwoNumbers() {
        assertEquals(12, LCM.lcm(new int[]{4, 6}));
    }

    @Test
    void testSingleElement() {
        assertEquals(7, LCM.lcm(new int[]{7}));
    }

    @Test
    void testPrimeNumbers() {
        assertEquals(30, LCM.lcm(new int[]{2, 3, 5}));
    }

    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> LCM.lcm(new int[]{}));
    }
}

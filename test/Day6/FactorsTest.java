package Day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorsTest {

    @Test
    public void testFactors() {
        int[] factors = Factors.getFactors(12);
        int factorCount = factors.length;

        assertEquals(5, factorCount);
    }

    @Test
    public void testArrayFactors() {
        int[] factors = Factors.getFactors(20);
        assert(factors[0] == 2 && factors[1] == 4 && factors[2] == 5 && factors[3] == 10 && factors[4] == 20);
    }
}

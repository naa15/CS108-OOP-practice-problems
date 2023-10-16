import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMath {

    @Test
    public void smallNumbers() {
        assertEquals(5, Math.add(2, 3));
    }

    @Test
    public void zeroSum() {
        assertEquals(0, Math.add(5, -5));
    }

    @Test
    public void zeroAbs() {
        assertEquals(0, Math.abs(0));
    }

    @Test
    public void positiveAbs() {
        assertEquals(5, Math.abs(5));
    }

    @Test
    public void negativeAbs() {
        assertEquals(5, Math.abs(-5));
    }
}

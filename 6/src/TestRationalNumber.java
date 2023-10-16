import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRationalNumber {

    @Test
    public void createNormally() {
        RationalNumber number = new RationalNumber(3,4);
        assertEquals(3, number.getNumerator());
        assertEquals(4, number.getDenominator());
    }

    @Test
    public void createWithGCD() {
        RationalNumber number = new RationalNumber(15,25);
        assertEquals(3, number.getNumerator());
        assertEquals(5, number.getDenominator());
    }

    @Test
    public void createWithNegative() {
        RationalNumber number = new RationalNumber(30,-13);
        assertEquals(-30, number.getNumerator());
        assertEquals(13, number.getDenominator());
    }

    @Test
    public void testMultipication() {
        RationalNumber number = new RationalNumber(3, 5);
        RationalNumber number1 = new RationalNumber(4, -9);

        RationalNumber number2 = new RationalNumber(-12, 45);
        assertEquals(number2, number.mult(number1));
    }
}

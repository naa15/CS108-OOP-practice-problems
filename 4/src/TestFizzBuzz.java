import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    private static FizzBuzz fb;

    @BeforeAll
    public static void init() {
        fb = new FizzBuzz();
    }

    @Test
    public void create() {
        FizzBuzz fb = new FizzBuzz();
    }

    @Test
    public void div15() {
        assertEquals("FizzBuzz", fb.evaluate(15));
        assertEquals("FizzBuzz", fb.evaluate(30));
        assertEquals("FizzBuzz", fb.evaluate(150));

        for (int i = 1; i < 10; i++) {
            assertEquals("FizzBuzz", fb.evaluate(i*15));
        }
    }

    @Test
    public void contains35() {
        assertEquals("FizzBuzz", fb.evaluate(35));
        assertEquals("FizzBuzz", fb.evaluate(32145));
        assertEquals("FizzBuzz", fb.evaluate(5359));
    }

    @Test
    public void div3() {
        assertEquals("Fizz", fb.evaluate(18));
        assertEquals("Fizz", fb.evaluate(21));
        assertEquals("Fizz", fb.evaluate(333));
    }

    @Test
    public void div5() {
        assertEquals("Buzz", fb.evaluate(50));
        assertEquals("Buzz", fb.evaluate(190));
        assertEquals("Buzz", fb.evaluate(200));
    }

    @Test
    public void contains3() {
        assertEquals("Fizz", fb.evaluate(31));
        assertEquals("Fizz", fb.evaluate(443));
        assertEquals("Fizz", fb.evaluate(1234));
    }

    @Test
    public void contains5() {
        assertEquals("Buzz", fb.evaluate(559));
        assertEquals("Buzz", fb.evaluate(652));
        assertEquals("Buzz", fb.evaluate(151));
    }

    @Test
    public void others() {
        assertEquals("1", fb.evaluate(1));
        assertEquals("17", fb.evaluate(17));
        assertEquals("742", fb.evaluate(742));
    }
}

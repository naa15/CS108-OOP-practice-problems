import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPair {
    private Pair<Integer, Integer> p;

    @BeforeEach
    public void init() {
        p = new Pair<>(3,4);
    }

    @Test
    public void create() {
        p = new Pair<>(3,4);
    }

    @Test
    public void getFirst() {
        assertEquals(3, p.getX());
    }

    @Test
    public void getSecond() {
        assertEquals(4, p.getY());
    }

    @Test
    public void setsXCorrectly() {
        p.setFirst(5);
        assertEquals(5, p.getX());
    }

    @Test
    public void setsYCorrectly() {
        p.setSecond(10);
        assertEquals(10, p.getY());
    }

    @Test
    public void compare() {
        Pair<Integer, Integer> q = new Pair<>(3,4);
        Pair<Integer, Integer> s = new Pair<>(7,8);

        assertTrue(p.equals(q));
        assertFalse(p.equals(s));
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyStack {

    private MyStack<String> myStack;

    @BeforeEach
    public void init() {
        myStack = new MyStack<>();
    }

    @Test
    public void sizeEmpty() {
        assertEquals(0, myStack.size());
    }

    @Test
    public void sizeOneLength() {
        myStack.add("lala");
        assertEquals(1, myStack.size());
    }

    @Test
    public void sizeManyLength() {
        for (int i = 0; i < 100; i++) {
            myStack.add("Elem" + i);
        }
        assertEquals(100, myStack.size());
    }

    @Test
    public void addOne() {
        myStack.add("Elem");
        assertEquals("Elem", myStack.pop());
    }

    @Test
    public void popEmpty() {
        assertThrows(IndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                myStack.pop();
            }
        });
    }
}

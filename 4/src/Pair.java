import java.util.Objects;

public class Pair <T1, T2> {

    private T1 x;
    private T2 y;

    public Pair(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public void setFirst(T1 x) {
        this.x = x;
    }

    public void setSecond(T2 y) {
        this.y = y;
    }

    public T1 getX() {
        return x;
    }

    public T2 getY() {
        return y;
    }

    @Override
    public boolean equals(Object pair) {
        if (!(pair instanceof Pair))
            return false;

        Pair<?, ?> p = (Pair<?, ?>) pair;
        return Objects.equals(x, p.getX()) && Objects.equals(y, p.getY());
    }
}

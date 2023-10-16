package Version3;

import Version2.Node;

public class ValueNode implements Node {
    private double value;

    public ValueNode(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + value + ")";
    }
}

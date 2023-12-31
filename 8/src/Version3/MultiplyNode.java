package Version3;

public class MultiplyNode extends BinaryOperation {

    public MultiplyNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    double doEvaluate(double left, double right) {
        return left * right;
    }

    @Override
    char getOperator() {
        return '*';
    }
}

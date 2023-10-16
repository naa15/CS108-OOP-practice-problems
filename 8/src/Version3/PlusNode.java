package Version3;

public class PlusNode extends BinaryOperation {

    public PlusNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    double doEvaluate(double left, double right) {
        return left + right;
    }

    @Override
    char getOperator() {
        return '+';
    }
}

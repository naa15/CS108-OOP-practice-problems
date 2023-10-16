package Version3;

public class MinusNode extends BinaryOperation {

    public MinusNode(Version3.Node left, Version3.Node right) {
        super(left, right);
    }

    @Override
    double doEvaluate(double left, double right) {
        return left - right;
    }

    @Override
    char getOperator() {
        return '-';
    }
}

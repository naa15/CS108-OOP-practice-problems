package Version3;

public class DivideNode extends BinaryOperation {

    public DivideNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    double doEvaluate(double left, double right) {
        return left / right;
    }

    @Override
    char getOperator() {
        return '/';
    }
}

package Version3;

public class Main {
    public static void main(String[] args) {
        ValueNode left = new ValueNode(1);
        MultiplyNode right = new MultiplyNode((Node) new ValueNode(2), (Node) new ValueNode(3));
        DivideNode right2 = new DivideNode((Node) new ValueNode(4), (Node) new ValueNode(2));
        PlusNode result1 = new PlusNode((Node) left, (Node) right);
        MinusNode result2 = new MinusNode((Node) left, (Node) right2);
        System.out.println(result1);
        System.out.println(result1.evaluate());
        System.out.println(result2);
        System.out.println(result2.evaluate());
    }
}

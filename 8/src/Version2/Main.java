package Version2;

public class Main {
    public static void main(String[] args) {
        ValueNode left = new ValueNode(1);
        MultiplyNode right = new MultiplyNode(new ValueNode(2), new ValueNode(3));
        DivideNode right2 = new DivideNode(new ValueNode(4), new ValueNode(2));
        PlusNode result1 = new PlusNode(left, right);
        MinusNode result2 = new MinusNode(left, right2);
        System.out.println(result1);
        System.out.println(result1.evaluate());
        System.out.println(result2);
        System.out.println(result2.evaluate());
    }
}

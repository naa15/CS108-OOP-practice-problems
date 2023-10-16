package inheritance;

public class Test {

    public static void main(String args[]) {
        Parent p = new Parent();
        Child ch = new Child();
        Parent p2 = new Child();
        // Child ch2 = new Parent();

        invoke(p);
        invoke(ch);
        invoke(p2);
    }

    public static void invoke(Parent p) {
        p.go();
    }

    public static void invoke(Child ch) {
        ch.go();
    }
}

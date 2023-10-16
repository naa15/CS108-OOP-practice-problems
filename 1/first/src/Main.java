import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ListNode one = new ListNode(9);

        ListNode eleven = new ListNode(9);
        ListNode ten = new ListNode(9, eleven);
        ListNode nine = new ListNode(9, ten);
        ListNode eight = new ListNode(9, nine);
        ListNode seven = new ListNode(9, eight);
        ListNode six = new ListNode(9, seven);
        ListNode five = new ListNode(9, six);
        ListNode four = new ListNode(9, five);
        ListNode three = new ListNode(9, four);
        ListNode two = new ListNode(1, three);

        ListNode result = addTwoNumbers(one, two);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            BigInteger number = add(l1, l2, 1);
            ListNode result = makeListNode(number.intValue());
            return result;
        }

        public static ListNode makeListNode(long number) {
            int decimal = 1;
            long curNumber = number;
            while(curNumber >= 10) {
                curNumber = curNumber / 10;
                decimal *= 10;
            }
            ListNode prev = null;
            while(number >= 0 && decimal > 0) {
                ListNode cur = new ListNode((int)(number / decimal), prev);
                number -= (number/decimal * decimal);
                decimal /= 10;
                prev = cur;
            }
            return prev;
        }

        public static BigInteger add(ListNode l1, ListNode l2, BigInteger decimal) {
            BigInteger result = BigInteger.valueOf(0);
            if(l1 == null && l2 == null) return BigInteger.valueOf(0);
            if(l1 == null) {
                result += l2.val * decimal;
                result += add(l1, l2.next, decimal * 10);
            } else if(l2 == null){
                result += l1.val * decimal;
                result += add(l1.next, l2, decimal * 10);
            } else {
                result += l1.val * decimal;
                result += l2.val * decimal;
                result += add(l1.next, l2.next, decimal * 10);
            }
            return result;
        }
}
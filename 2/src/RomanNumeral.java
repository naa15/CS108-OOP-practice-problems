public class RomanNumeral {
    private int arabic;
    private String roman;

    private final static int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final static String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public int findNumber(String ch) {
        for (int i = 0; i < letters.length; i++) {
            if(letters[i].equals(ch)) {
                return numbers[i];
            }
        }
        return -1;
    }
    public RomanNumeral(String arg) {
        arg = arg.toUpperCase();
        int res = 0;
        for (int i = 0; i < arg.length(); i++) {
            String curr = "" + arg.charAt(i);
            int number = findNumber(curr);
            if(i+1 < arg.length()) {
                String next = "" + arg.charAt(i+1);
                int number2 = findNumber(next);

                if (number2 > number) {
                    res -= number;
                } else {
                    res += number;
                }
            } else {
                res += number;
            }
        }
        this.arabic = res;
    }
    public RomanNumeral(int arabic) {
        this.arabic = arabic;
    }

    public int toInt() {
        return arabic;
    }

    public String toString() {
        int curr = arabic;
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            while (curr >= numbers[i]) {
                curr -= numbers[i];
                res += letters[i];
            }
        }
        return res;
    }
}

public class FizzBuzz {

    public String evaluate(int i) {
        if (i % 15 == 0 || (containsDigit(i, "3") && containsDigit(i, "5")))
            return "FizzBuzz";

        if (i % 3 == 0 || containsDigit(i, "3"))
            return "Fizz";

        if (i % 5 == 0 || containsDigit(i, "5"))
            return "Buzz";

        return String.valueOf(i);
    }

    public boolean containsDigit(int num, String digit) {
        return String.valueOf(num).contains(digit);
    }
}

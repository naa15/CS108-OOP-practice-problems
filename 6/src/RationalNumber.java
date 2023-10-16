public class RationalNumber {

    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        // shemowmeba - iani xo araa, an xo a rikveceba
        if (denominator < 0) {
            denominator *= -1;
            numerator *= -1;
        }

        int gcd = findGCD(numerator, denominator);

        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
    }

    private int findGCD(int a, int b) {
        if (b == 0) return a;

        return findGCD(b, a % b);
    }

    public RationalNumber(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public RationalNumber(RationalNumber number) {
        numerator = number.numerator;
        denominator = number.denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber a) {
        return null;
    }

    public RationalNumber mult(RationalNumber a) {
        return new RationalNumber(numerator * a.getNumerator(), denominator * a.getDenominator());
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(numerator).hashCode() & Integer.valueOf(denominator).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof RationalNumber)) return false;
        return numerator == ((RationalNumber)obj).getNumerator() && denominator == ((RationalNumber)obj).getDenominator();
    }
}

import java.math.BigInteger;

public class Tuple {
    //Integer tuple
    private int intOne, intTwo;

    public Tuple(int intOne, int intTwo) {
        this.intOne = intOne;
        this.intTwo = intTwo;
    }

    public int getOne() {
        return intOne;
    }

    public int getTwo() {
        return intTwo;
    }

    public int getLowest() {
        if (intOne <= intTwo) {
            return intOne;
        } else {
            return intTwo;
        }
    }

    public int getHighest() {
        if (intOne >= intTwo) {
            return intOne;
        } else {
            return intTwo;
        }
    }

    public int getDifference() {
        return Math.abs(intOne - intTwo);
    }

    //BigInteger tuple
    private BigInteger bigIntOne, bigIntTwo;

    public Tuple(BigInteger one, BigInteger two) {
        this.bigIntOne = one;
        this.bigIntTwo = two;
    }

    public BigInteger getBigIntOne() {
        return bigIntOne;
    }

    public BigInteger getBigIntTwo() {
        return bigIntTwo;
    }

    public static BigInteger pow(BigInteger base, BigInteger exponent) {
        BigInteger result = BigInteger.ONE;
        while (exponent.signum() > 0) {
            if (exponent.testBit(0)) result = result.multiply(base);
            base = base.multiply(base);
            exponent = exponent.shiftRight(1);
        }
        return result;
    }

    @Override
    public String toString() {
        return intOne + " " + intTwo;
    }

    public static int fac(int number) {
        int fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }
}

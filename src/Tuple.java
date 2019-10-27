public class Tuple {

    private int one, two;

    public Tuple (int one, int two) {
        this.one = one;
        this.two = two;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getLowest () {
        if (one <= two) {
            return one;
        } else {
            return two;
        }
    }

    public int getHighest () {
        if (one >= two) {
            return one;
        } else {
            return two;
        }
    }

    public int getDifference () {
        return Math.abs(one - two);
    }
}

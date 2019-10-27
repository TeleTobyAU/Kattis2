public class ADifferentProblem {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        while (io.hasMoreTokens()) {
            long x = io.getLong();
            long y = io.getLong();
            System.out.println(Math.abs(x-y));
        }
    }
}


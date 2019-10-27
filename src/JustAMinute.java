public class JustAMinute {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int min = 0, second = 0;
        for (int i = 0; i < n; i++) {
            min += io.getInt();
            second += io.getInt();
        }

        double sl = second / (min * 60.0);
        if (sl <= 1) {
            System.out.println("measurement error");
        } else {
            System.out.println(sl);
        }
    }
}

public class NastyHacks {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int r = io.getInt();
            int e = io.getInt();
            int c = io.getInt();

            if (r < e-c) System.out.println("advertise");
            if (r == e-c) System.out.println("does not matter");
            if (r > e-c) System.out.println("do not advertise");
        }
    }
}

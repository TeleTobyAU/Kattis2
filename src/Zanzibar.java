public class Zanzibar {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int g = 1;
            int ans = 0;

            while (g != 0) {
                int h = io.getInt();

                if (h > g*2) {
                    ans += h - 2*g;
                }
                g = h;
            }
            System.out.println(ans);
        }
    }
}

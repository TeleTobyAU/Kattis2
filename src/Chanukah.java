public class Chanukah {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt();
        for (int i = 0; i < p; i++) {
            int k = io.getInt(), n = io.getInt();
            int candles = 0;
            for (int j = 0; j < n+1; j++) {
                candles += j;
            }
            candles += n;
            System.out.println(k + " " + candles);
        }
    }
}

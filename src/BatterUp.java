public class BatterUp {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        double n = io.getInt(), output = 0, j = n;

        for (int i = 0; i < n; i++) {
            int h = io.getInt();
            if (h == -1) {
                j--;
            } else {
                output += h;
            }
        }

        System.out.println(output/j);
    }
}

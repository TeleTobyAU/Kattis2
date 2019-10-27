public class ShatteredCake {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int w = io.getInt(), n = io.getInt();
        int area = 0;
        for (int i = 0; i < n; i++) {
            int wi = io.getInt(), li = io.getInt();
            area += wi * li;
        }
        System.out.println(area / w);
    }
}

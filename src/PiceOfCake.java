public class PiceOfCake {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), h = io.getInt(), v = io.getInt();
        int bigH, bigV;
        if (h > n - h) {
            bigH = h;
        } else {
            bigH = n - h;
        }
        if (v > n - v) {
            bigV = v;
        } else {
            bigV = n - v;
        }
        System.out.println(bigH * bigV * 4);
    }
}

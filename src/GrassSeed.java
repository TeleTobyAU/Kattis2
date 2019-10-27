public class GrassSeed {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        double cost = io.getDouble();
        int lawns = io.getInt();
        double price = 0;

        for (int i = 0; i < lawns; i++) {
            double w = io.getDouble();
            double l = io.getDouble();
            double sm = w * l;

            price += sm * cost;
        }
        System.out.println(price);
    }
}

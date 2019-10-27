public class SodaSurpler {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        int current = io.getInt()+io.getInt();
        int price = io.getInt();

        int sodas = current/price;
        current = sodas;
        while (current >= price) {
            sodas++;
            current++;
            current -= price;
        }

        System.out.println(sodas);
    }
}

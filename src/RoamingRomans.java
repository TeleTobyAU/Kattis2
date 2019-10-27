public class RoamingRomans {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        double x = io.getDouble();

        double output = (x * 1000 / 4854) * 5280;
        System.out.println(Math.toIntExact(Math.round(output)));
    }
}

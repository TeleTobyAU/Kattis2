public class RailRoad {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int x = io.getInt();
        int y = io.getInt();

        if (y%2 == 1) {
            System.out.println("impossible");
        } else {
            System.out.println("possible");
        }
    }
}

public class DiceGame {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int gunnar = 0, emma = 0;

        for (int i = 0; i < 2; i++) {
            int a = io.getInt(), b = io.getInt();
            gunnar += b-a;
        }
        for (int i = 0; i < 2; i++) {
            int a = io.getInt(), b = io.getInt();
            emma += b-a;
        }

        System.out.println(emma);
        System.out.println(gunnar);

        if (emma > gunnar) System.out.println("Emma");
        if (emma < gunnar) System.out.println("Gunnar");
        if (emma == gunnar) System.out.println("Tie");
    }
}

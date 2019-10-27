public class Oddities {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int reps = io.getInt();

        for (int i = 0; i < reps; i++) {
            int num = io.getInt();
            int mod = Math.floorMod(num, 2);

            if (mod == 0) { System.out.println(num + " is even"); }
            if (mod == 1) { System.out.println(num + " is odd"); }
        }
    }
}

public class Ladder {
    public static void main(String[] args) {
        Kattio io = new Kattio (System.in);
        int h = io.getInt();
        int v = io.getInt();

        int l =  (int) Math.ceil(h/Math.sin(Math.toRadians(v)));
        System.out.println(l);
    }
}
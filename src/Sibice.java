public class Sibice {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int w = io.getInt();
        int h = io.getInt();

        double diagonal = Math.sqrt(w*w+h*h);

        for (int i = 0; i < n; i++) {
            int t = io.getInt();
            if (diagonal < t) System.out.println("NE");
            if (diagonal >= t) System.out.println("DA");
        }
    }
}

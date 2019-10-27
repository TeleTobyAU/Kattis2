public class BeaverGnaw {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        double ld= 0;
        while (true) {
            double d = io.getDouble(), v = io.getDouble();
            if (d==0 && v==0) break;

            ld = Math.pow(d, 3) - 6*v/Math.PI;
            System.out.println(Math.pow(ld, 1/3.0));
        }
    }
}

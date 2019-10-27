public class HeartRate {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        for (int i = 0; i < n; i++) {
            int b = io.getInt();
            double p = io.getDouble();

            //Virker ikke
            double abpm = b * p * p;
            System.out.println(abpm);

            double bpm = 60 * b / p;
            System.out.println(bpm);

            double mbpm = bpm + b*2;
            System.out.println(mbpm);
        }
    }
}

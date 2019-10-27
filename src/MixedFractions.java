public class MixedFractions {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        while (true) {
            int num = io.getInt(), den = io.getInt();
            if (num == 0 && den == 0) return;

            int w = num/den;
            System.out.print(w + " ");

            num = num-w*den;
            System.out.println(num + " / " + den);
        }
    }
}

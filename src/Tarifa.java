public class Tarifa {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int limit = io.getInt();
        int period = io.getInt();
        int oh = 0;
        for (int i = 0; i < period; i++) {
            oh += limit-io.getInt();
        }
        oh += limit;
        System.out.println(oh);
        }
    }



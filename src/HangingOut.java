public class HangingOut {
    public static void main(String[] args) {
        Kattio io = new Kattio((System.in));
        int l = io.getInt();
        int n = io.getInt();
        int rej = 0;
        int no = 0;

        for (int i = 0; i < n; i++) {
            String inp = io.getWord();
            int peo = io.getInt();
            if (inp.equals("enter")) {
                if (no >= l) {
                    rej++;
                } else if (no+peo > l) {
                    rej++;
                } else {
                    no += peo;
                }
            }
            if (inp.equals("leave")) {
                no -= peo;
            }
        }
        System.out.println(rej);
    }
}

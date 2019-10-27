public class DeathKnight {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        int wins = n;
        for (int i = 0; i < n; i++) {
            String input = io.getWord();
            char[] inp = input.toCharArray();

            char prev = ' ';
            for (char c : inp) {
                if (c == 'D' && prev == 'C') wins--;
                prev = c;
            }
        }
        System.out.println(wins);
    }
}

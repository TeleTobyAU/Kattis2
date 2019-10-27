public class HydrasHeads {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);

        while (true) {
            int moves = 0;
            int heads = io.getInt(), tails = io.getInt();
            if (heads == 0 || tails == 0) return;

            boolean solved = false;
            while (!solved) {
                if (heads == 0 && tails == 0) {
                    System.out.println(moves);
                    solved = true;
                }

                if (tails >= 2) {
                    tails -= 2;
                    heads++;
                    moves++;
                } else if (heads >= 2) {
                    heads = heads-2;
                    moves++;
                } else if (tails == 1) {
                    tails += 1;
                    moves++;
                } else if (heads == 1) {
                    System.out.println(-1);
                    solved = true;
                }
                System.out.println("heads: " + heads + " tails: " + tails + " moves: " + moves);
            }
        }
    }
}

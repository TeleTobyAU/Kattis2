import java.util.HashMap;

public class PokerHand {
    private static HashMap<Integer, Character> map;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            map.put(i, io.getWord().charAt(0));
        }

        int best = 0;
        char curr;
        char comp;
        for (int i = 0; i < 5; i++) {
            curr = map.get(i);
            int currBest = 0;
            for (int j = 0; j < 5; j++) {
                comp = map.get(j);
                if (curr == comp) {
                    currBest++;

                }
            }
            if (best < currBest) {
                best = currBest;
            }

        }
        System.out.println(best);
    }
}


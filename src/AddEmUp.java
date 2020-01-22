import java.util.*;
import java.util.regex.*;

public class AddEmUp {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        ArrayList<Tuple> cards = new ArrayList<>();
        int n = io.getInt(), s = io.getInt();

        for (int i = 0; i < n; i++) {
            int k = io.getInt();
            if (canFlip(k)) {
                cards.add(new Tuple(k, flippedValue(k)));
            } else {
                cards.add(new Tuple(k, k));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if ((cards.get(i).getOne() + cards.get(j).getOne() == s) ||
                            (cards.get(i).getOne() + cards.get(j).getTwo() == s) ||
                            (cards.get(i).getTwo() + cards.get(j).getOne() == s) ||
                            (cards.get(i).getTwo() + cards.get(j).getTwo() == s)) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }

    private static boolean canFlip(int i) {
        String pattern = "(3)(4)(7)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(String.valueOf(i));
        return !(m.find());
    }

    private static int flippedValue(int i) {
        StringBuilder sb = new StringBuilder();
        return Integer.parseInt(sb.append(i).reverse().toString());
    }
}
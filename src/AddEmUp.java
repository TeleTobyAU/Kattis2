import java.util.ArrayList;

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

        boolean works = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if ((cards.get(i).getOne() + cards.get(j).getOne() == s) ||
                            (cards.get(i).getOne() + cards.get(j).getTwo() == s) ||
                            (cards.get(i).getTwo() + cards.get(j).getOne() == s) ||
                            (cards.get(i).getTwo() + cards.get(j).getTwo() == s)) {
                        works = true;
                    }
                }
            }
        }

        for (Tuple t: cards) {
            System.out.println(t.getOne() + " " + t.getTwo());
        }

        if (works) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean canFlip(int i) {
        String number = String.valueOf(i);
        return !(number.contains("3") || number.contains("4") || number.contains("7"));
    }

    private static int flippedValue(int i) {
        String number = String.valueOf(i);
        char[] flippedNumber = new char[number.length()];

        for (int j = number.length()-1; j >= 0; j--) {
                char currChar = number.charAt(j);
                flippedNumber[number.length()-j] = currChar;
        }

        return Integer.parseInt(String.valueOf(flippedNumber));
    }
}

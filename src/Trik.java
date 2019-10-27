import java.util.ArrayList;

public class Trik {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String in = io.getWord();
        int n = in.length();
        ArrayList<Character> input = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input.add(i, in.charAt(i));
        }

        int pos = 1;
        for (int i = 0; i < n; i++) {
            if (pos == 1 && input.get(i) == 'A') {
                pos =2;
            } else if (pos == 2 && input.get(i) == 'A') {
                pos =1;
            } else if (pos == 2 && input.get(i) == 'B') {
                pos =3;
            } else if (pos == 3 && input.get(i) == 'B') {
                pos =2;
            } else if (pos == 1 && input.get(i) == 'C') {
                pos =3;
            } else if (pos == 3 && input.get(i) == 'C') {
                pos =1;
            }
        }

        System.out.println(pos);
    }
}

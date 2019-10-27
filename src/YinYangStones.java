import java.util.*;

public class YinYangStones {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();

        ArrayList<Character> inp = HelperClass.stringToList(input);

        int b = 0, w = 0;
        for (char c : inp) {
            if (c == 'B') b++;
            if (c == 'W')  w++;
        }

        if (w == b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

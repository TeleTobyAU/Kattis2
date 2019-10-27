import java.util.*;

public class HeirsDilemma {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String l = io.getWord(), h = io.getWord();

        int lInt = Integer.parseInt(l), hInt = Integer.parseInt(h);

        int tries = 0;
        for (int i = lInt; i <= hInt; i++) {
            int input = lInt+i;
            ArrayList<Character> list = HelperClass.stringToList(Integer.toString(input));

            int chances = 0;
            for (char c: list) {
                int div = Character.getNumericValue(c);
                if (div != 0) if (input % Character.getNumericValue(div) == 0) chances++;
            }
            if (chances == 6) tries++;
            System.out.println("Chances: " + chances);
        }
        System.out.println(tries);
    }
}

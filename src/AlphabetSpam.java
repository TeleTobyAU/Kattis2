import java.util.*;

public class AlphabetSpam {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        ArrayList<Character> in = HelperClass.stringToList(input);

        double ws = 0, lc = 0, uc = 0, sym = 0;
        for (Character c : in) {
            if (Character.isUpperCase(c)) uc++;
            if (Character.isLowerCase(c)) lc++;
            if (c == '_') ws++;
            if (!Character.isAlphabetic(c) && c != '_') sym++;
        }

        int n = in.size();
        ws = ws/n;
        lc = lc/n;
        uc = uc/n;
        sym = sym/n;
        System.out.println(ws);
        System.out.println(lc);
        System.out.println(uc);
        System.out.println(sym);
    }
}

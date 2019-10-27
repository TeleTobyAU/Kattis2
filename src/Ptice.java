import java.util.*;

public class Ptice {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String input = io.getWord();
        ArrayList<Character> inp = HelperClass.stringToList(input);

        String adrian = "ABC"; //Mod3
        String bruno = "BABC"; //Mod4
        String goran = "CCAABB"; //Mod 6

        ArrayList<Character> adrianList = HelperClass.stringToList(adrian);
        ArrayList<Character> brunoList = HelperClass.stringToList(bruno);
        ArrayList<Character> goranList = HelperClass.stringToList(goran);

        int adrianScore = 0, brunoScore = 0, goranScore = 0;

        for (int i = 0; i < n; i++) {
            if (inp.get(i) == adrianList.get(i%3)) adrianScore++;
            if (inp.get(i) == brunoList.get(i%4)) brunoScore++;
            if (inp.get(i) == goranList.get(i%6)) goranScore++;
        }

        int maxScore = Math.max(adrianScore, brunoScore);
        maxScore = Math.max(brunoScore, goranScore);

        System.out.println(maxScore);
        if (adrianScore == maxScore) System.out.println("Adrian");
        if (brunoScore == maxScore) System.out.println("Bruno");
        if (goranScore == maxScore) System.out.println("Goran");
    }
}
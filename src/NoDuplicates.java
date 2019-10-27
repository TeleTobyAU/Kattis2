import java.util.*;

public class NoDuplicates {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        while (io.hasMoreTokens()) {
            String inp = io.getWord();
            map.put(inp, inp);
            list.add(inp);
        }

        if (list.size() == map.size()) System.out.println("yes");
        if (list.size() != map.size()) System.out.println("no");
    }
}
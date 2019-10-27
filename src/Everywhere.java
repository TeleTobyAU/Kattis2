import java.util.HashMap;

public class Everywhere {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int t = io.getInt();

        HashMap<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < t; i++) {
            int n = io.getInt();
            for (int j = 0; j < n; j++) {
                String curr = io.getWord();
                map.put(curr,true);
            }
            System.out.println(map.size());
            map.clear();
        }

    }
}

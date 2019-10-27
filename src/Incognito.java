import java.util.HashMap;

public class Incognito {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int m = io.getInt();
            HashMap<String, Integer> items = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String item = io.getWord();
                String cat = io.getWord();
                if (items.containsKey(cat)) {
                    items.put(cat, items.get(cat)+1);
                } else {
                    items.put(cat, 1);
                }
            }
            int combinations = 1;
            for (Integer num : items.values()) {
                combinations += combinations * num;
            }
            System.out.println(combinations-1);
        }
    }
}

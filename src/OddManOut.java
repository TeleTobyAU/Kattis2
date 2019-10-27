import java.lang.reflect.*;
import java.util.*;

public class OddManOut {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        HashMap<Long, Long> map = new HashMap<>();
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int k = io.getInt();
            for (int j = 0; j < k; j++) {
                long in = io.getLong();
                if (map.containsKey(in)) {
                    map.remove(in);
                } else {
                    map.put(in, in);
                }
            }
            ArrayList<Long> out = new ArrayList<>(map.values());
            System.out.println("Case #" + (i+1) + ": " + out.get(0));
            map.clear();
        }
    }
}
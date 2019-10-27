import java.util.*;

public class Relocation {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int q = io.getInt();
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, io.getInt());
        }

        for (int i = 0; i < q; i++) {
            //Pulls the type of query
            int type = io.getInt();

            if (type == 1) {
                int comp = io.getInt(), loc = io.getInt();
                map.put(comp, loc);
            } else if (type == 2) {
                int a = io.getInt(), b = io.getInt();
                int dist = Math.abs(map.get(a) - map.get(b));
                System.out.println(dist);
            }
        }
    }
}

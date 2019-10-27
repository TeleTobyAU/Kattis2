import java.util.ArrayList;
import java.util.Collections;

public class Parking {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            int m = io.getInt();
            ArrayList<Integer> shops = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                shops.add(io.getInt());
            }
            Collections.sort(shops);
            System.out.println((shops.get(shops.size()-1) - shops.get(0)) * 2);
        }
    }
}

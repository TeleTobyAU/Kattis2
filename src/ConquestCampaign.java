import java.util.*;

public class ConquestCampaign {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt(), c = io.getInt(), n = io.getInt();
        ArrayList<ArrayList<Boolean>> row = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            row.add(new ArrayList<>());
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                row.get(i).get(j);
            }
        }

        for (int i = 0; i < n; i++) {
            int x = io.getInt(), y = io.getInt();

        }
    }
}

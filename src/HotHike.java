import java.util.ArrayList;
import java.util.HashMap;

public class HotHike {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        ArrayList<Integer> days = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            days.add(io.getInt());
        }

        HashMap<Integer, Tuple> hafla = new HashMap<>();

        for (int i = 1; i < n-1; i++) {
            hafla.put(i, new Tuple(days.get(i-1), days.get(i+1)));
        }

        int coldest = 1;
        for (int i = 1; i < hafla.keySet().size(); i++) {
            if (hafla.get(i).getHighest() < hafla.get(coldest).getHighest()) {
                coldest = i;
            }
        }

        ArrayList<Integer> winners = new ArrayList<>();
        winners.add(coldest);
        for (int i = 1; i < hafla.keySet().size(); i++) {
            if (hafla.get(i).getHighest() == coldest) {
                winners.add(i);
            }
        }

        int actColdest = winners.get(0);
        for (int i = 0; i < winners.size(); i++) {
            if (hafla.get(winners.get(i)).getLowest() < hafla.get(actColdest).getLowest()) {
                actColdest = i;
            }
        }

        System.out.println(actColdest + " " +  hafla.get(actColdest).getHighest());
    }
}

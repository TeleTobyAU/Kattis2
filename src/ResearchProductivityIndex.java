import java.util.ArrayList;
import java.util.Collections;

public class ResearchProductivityIndex {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        ArrayList<Integer> paperProbs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            paperProbs.add(io.getInt());
        }
        Collections.sort(paperProbs);

        ArrayList<Double> indexes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double potens = 0;
            for (int j = n-1; j > n-(i+2); j--) {
                potens += paperProbs.get(j);
            }
            System.out.println(potens/(100));
            indexes.add(Math.pow(i+1, (potens/100)/(i+1)));
        }
        Collections.sort(indexes);

        for (Double d : indexes) {
            System.out.println(d);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FlexibaleSpaces {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int w = io.getInt(), p = io.getInt();
        int[] partitions = new int[p];
        for (int i = 0; i < p; i++) {
            partitions[i] = io.getInt();
        }

        ArrayList<Integer> combinations = new ArrayList<>();
        combinations.add(w);
        for (int i = 0; i < p; i++) {
            combinations.add(partitions[i]);
            for (int j = 0; j < p; j++) {
                if (j != i) {
                    combinations.add(Math.abs(partitions[i] - partitions[j]));
                    combinations.add(Math.abs(partitions[i] - w));
                }
            }
        }
        Collections.sort(combinations);
        LinkedHashSet<Integer> combi = new LinkedHashSet<>(combinations);
        if (combi.contains(0)) {
            combi.remove(0);
        }
        for (Integer i : combi) {
            System.out.print(i + " ");
        }
    }
}
